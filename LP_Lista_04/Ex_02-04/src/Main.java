import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (i == 0) {
                maior = number;
                menor = number;

            } else {
                if (number > maior) {
                    maior = number;
                }
                if (number < menor) {
                    menor = number;
                }
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
