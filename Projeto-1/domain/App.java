package Davi.domain;

import Davi.dao.ClienteMapDAO;
import Davi.dao.IClienteDAO;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Bem vindo!", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alterar  ou 5 para sair",
                    "Bem vindo!", JOptionPane.INFORMATION_MESSAGE);
        }
        while (isOpcaoValida(opcao)){
            if (isOpcaoSair(opcao)){
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Confirmando o CPF, Telefone...",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF cadastrado",
                        "Excluindo CPF", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null, "Informe os dados do cliente para altera-lo",
                        "Alterando dados", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcao = JOptionPane.showInputDialog(null, "digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alterar  ou 5 para sair",
                    "Bem vindo", JOptionPane.INFORMATION_MESSAGE);
        }

            if (isOpcaoCadastro(opcao)) {
                JOptionPane.showMessageDialog(null, "Opcao: " + opcao, "ERRO", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    private static void alterar(String dados) {
        String [] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6], dadosSeparados[7]);
        if (dadosSeparados[1].equals(dadosSeparados[2])) {
            JOptionPane.showMessageDialog(null, "Dados confirmados", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "CPF Invalido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        iClienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null, "Cliente Alterado", "sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
            JOptionPane.showMessageDialog(null, "Cliente excluido", "sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null){
            JOptionPane.showMessageDialog(null, "Cliente encontrado " + cliente.toString(),
                    "sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Cliente não encontrado",
                    "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExclusao(String opcao){
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }
    private static boolean isAlterar(String opcao){
        if ("4".equals(opcao)){
            return true;
        }
        return false;
    }
    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6], dadosSeparados[7]);
        boolean iscadastrado = iClienteDAO.cadastrar(cliente);
        if (dadosSeparados[1].equals(dadosSeparados[2])) {
            JOptionPane.showMessageDialog(null, "Dados confirmados", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "CPF Invalido", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        if (iscadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo! ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
        || "4".equals(opcao) || "5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
}
