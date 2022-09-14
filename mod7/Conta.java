//Ela deve mostrar as informações da conta do usuario


    public class Conta {

        private static String endereço;
        public static String nome;
        private static String email;
        public static String códigoPin;

        public static String getEndereço() {
            return endereço;
        }

        public static void setEndereço(String endereço) {
            Conta.endereço = endereço;
        }

        public static String getNome() {
            return nome;
        }

        public static void setNome(String nome) {
            Conta.nome = nome;
        }

        public static String getEmail() {
            return email;
        }

        public static void setEmail(String email) {
            Conta.email = "Melo_123@outlook.com";
        }

        public static String getCódigoPin() {
            return códigoPin;
        }

        public static void setCódigoPin(String códigoPin) {
            Conta.códigoPin = códigoPin;
        }

        public static void endereço() {
        }
    }


