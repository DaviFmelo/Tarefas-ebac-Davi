import java.util.Scanner;

public class Media {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

         System.out.println("********Media das 4 notas*********");

         System.out.println("\n Digite a nota da media 1: ");
         double media1 = s.nextDouble();

         System.out.println("\n Digite a nota da media 2: ");
         double media2 = s.nextDouble();

         System.out.println("\n Digite a nota da media 3");
         double media3 = s.nextDouble();

         System.out.println("\n Digite a nota da media 4");
         double media4 = s.nextDouble();

         double mediaTotal = (media1 + media2 + media3 + media4)/4;
         System.out.println("\n A Somatoria das medias é:  " + mediaTotal);
         String mediaTotalSt = getMediaTotal(mediaTotal);
         System.out.println(mediaTotalSt);

     }
     public static String getMediaTotal(double mediaTotal){
     if (mediaTotal >= 7){
         return "Aluno Aprovado";
     }else if (mediaTotal >=5){
         return "Aluno de Recuperação";
    }else{
         return "Aluno Reprovado";
        }
     }
}
