import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");

        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double number2 = in.nextDouble();

        double average = (number1 + number2) / 2;

        if(average >= 8.5){
            System.out.println("Nota A!");
        }
        else if(average >=7){
            System.out.println("Nota B!");
        }
        else if (average >= 5) {
            System.out.println("Nota C!");
        }
        else {
            System.out.println("Nota D!");
        }
    }
}