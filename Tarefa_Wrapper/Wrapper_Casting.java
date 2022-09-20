public class Wrapper_Casting {
    public static void main(String[] args){

            // Wrapper para Primitivo:

            int num1 = Integer.valueOf(123456);
            System.out.println(num1);

            // Primitivo para Wrapper

            Integer num2 = 1;
            System.out.println(num2);

            // Casting

            int num3 = 1021212;
            System.out.println(num3);
            short num4 = (short) num3;
            System.out.println(num4);
        }
    }
