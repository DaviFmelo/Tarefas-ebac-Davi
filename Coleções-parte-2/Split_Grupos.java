import java.util.Scanner;

class Split_Grupos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Masculino ou Feminino
        System.out.println("Digite os nomes e os gêneros separados por - e , ");

        String ordemA;
        String vNome = s.next();
        String[] nome = vNome.split(","); // Vai dividir por ","

        for (int i = 0; i < nome.length; i++) {
            for (int j = i + 1; j < nome.length; j++){

                // Organizar em ordem alfabética

                if (nome[i].compareTo(nome[j]) > 0){
                    ordemA = nome[i];
                    nome[i] = nome[j];
                    nome[j] = ordemA;
                }
            }
        }
        System.out.println(" ");
        System.out.println("***** Grupo Masculino *****");
        for (int i = 0; i < nome.length; i++){
            if (nome[i].contains("-Masculino")){
                System.out.println(" "+nome[i]);
            }
        }
        System.out.println("\n***** Grupo Feminino *****");
        for (int i = 0; i < nome.length; i++) {
            if (nome[i].contains("-Feminino")){
                System.out.println(" " + nome[i]);
            }
        }
    }
}

