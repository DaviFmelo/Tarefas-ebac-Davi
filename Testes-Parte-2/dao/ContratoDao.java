package dao;

public class ContratoDao implements IClienteDao {
    public String salvar(){
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Buscando CPF";
    }

    @Override
    public String excluir() {
        return "Excluindo usuário";
    }

    @Override
    public String atualizar() {
        return "Atualizando o cadastro";
    }
}