import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Ingrese nota de alumno (Número negativo para finalizar)");
            nota = sc.nextInt();
            if (nota >= 7 && nota <=10){
                System.out.println("Bien.");
            } else if (nota >=4 && nota<7) {
                System.out.println("Regular.");
            } else if (nota<4 && nota>0)  {
                System.out.println("Suspenso.");
            }
        } while (nota>0);


    }
}