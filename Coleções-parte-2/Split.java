import java.util.Scanner;

class Split {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por , ");

        String ordem;
        String vNome = s.next();
        String[] nome = vNome.split(","); // Vai dividir por ","

        // Organizar em ordem alfabética

        for (int i = 0; i < nome.length; i++) {
            for (int j = i + 1; j < nome.length; j++){

                if (nome[i].compareTo(nome[j]) > 0){
                    ordem = nome[i];
                    nome[i] = nome[j];
                    nome[j] = ordem;
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < nome.length; i++){
            System.out.println(" "+nome[i]);
        }
    }
}