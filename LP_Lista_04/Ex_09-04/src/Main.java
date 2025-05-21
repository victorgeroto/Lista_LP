import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            boolean perdeu = false;

            System.out.println(" Bem-vindo ao Jogo da Tabuada!");
            System.out.println("Responda corretamente todas as tabuadas de 1 a 10.");
            System.out.println("Se errar, o jogo acaba!\n");

            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta == i * j) {
                    } else {
                        System.out.println(" Você errou! A resposta correta era " + (i * j));
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("\n Parabéns! Você completou todas as tabuadas sem errar!");
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            String resposta = scanner.next().toLowerCase();
            jogarNovamente = resposta.equals("s");

            System.out.println();

        } while (jogarNovamente);

        System.out.println(" Obrigado por jogar! Até a próxima.");
        scanner.close();
    }
}
