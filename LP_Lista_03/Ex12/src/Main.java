import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double number2 = scanner.nextDouble();

        System.out.println("--------------------------------");
        System.out.println("Bem-Vindo a minicalculadora!!");
        System.out.println("--------------------------------");
        System.out.println("Menu:");
        System.out.println("    1 - Soma");
        System.out.println("    2 - Subtração");
        System.out.println("    3 - Multiplicação");
        System.out.println("    4 - Divisão");
        System.out.println("    5 - Sair");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma opção: ");
        int value = scanner.nextInt();

        switch (value){
            case 1:
                System.out.println("A soma dos números é: "+ (number + number2));
                break;
            case 2:
                System.out.println("A subtração dos números é: "+ (number - number2));
                break;
            case 3:
                System.out.println("A multiplicação dos números é: " + (number * number2));
                break;
            case 4:
                System.out.println("A divião dos números é: " +(number / number2));
                break;
            default:
                break;
        }

    }
}