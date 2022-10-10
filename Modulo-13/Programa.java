package Abstrato;

public class Programa {
    public static void main(String args []){

        PessoaJurídica pj = new PessoaJurídica();
        pj.setNome("Davi");
        pj.setSobrenome("França");
        pj.setCnpj(2134l);
        System.out.println("***** Pesssoa Jurídica *****");
        System.out.println("\nNome: "+pj.getNome() + " " + pj.getSobrenome());
        System.out.println("CNPJ: " + pj.getCnpj());

        PessoaFísica pf = new PessoaFísica();
        pf.setNome("Ingrid");
        pf.setSobrenome("França");
        pf.setCpf(321456355);
        pf.setDataDeNascimento("10/10/2002");
        pf.setRg(3215542342l);
        System.out.println("\n***** Pessoa Física ******");
        System.out.println("\nNome: " + pf.getNome() + " " + pf.getSobrenome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("RG: " + pf.getRg());
        System.out.println("Data de nascimento: " + pf.getDataDeNascimento());
    }
    }

