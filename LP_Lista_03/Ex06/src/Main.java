import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha uma opção entre 5 e 9: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number >= 5 && number <= 9  ){
            System.out.println("Você escolheu a opção: " + number);
        }
        else {
            System.out.println("Opção invalida!");
        }
    }
}