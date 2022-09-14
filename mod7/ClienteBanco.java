public class ClienteBanco {
    // A base onde irá comprimentar o usuário

    public static void main(String[] args) {
        System.out.println("Olá Davi");
        Conta conta = new Conta();
        Conta.setEndereço("Rua das Laranjeiras");
        System.out.println(Conta.getEndereço());
        Conta.setCódigoPin(String.valueOf(1234));
        System.out.println(Conta.getCódigoPin());
        System.out.println(Conta.getEmail());
    }
}
