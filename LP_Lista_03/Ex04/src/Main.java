import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");

        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double number2 = in.nextDouble();

        double average = (number1 + number2) / 2;

        if(average > 50){
            System.out.println("Aprovado! Sua média foi: " +average);
        }
        else{

            System.out.println("Reprovado! Sua média foi: " +average);
            System.out.println("Digite a nota da recuperação prova: ");
            double number3 = in.nextDouble();

            average = (average + number3) / 2;

            if(average > 50){
                System.out.println("Aprovado! Sua média foi: " +average);
            }
            else {
                System.out.println("Reprovado! Sua média foi: " +average);
            }
        }
    }
}