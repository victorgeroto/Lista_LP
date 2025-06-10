import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.println("\nMaior valor: " + maior + " (posição: " + posicaoMaior + ")");
        System.out.println("Menor valor: " + menor + " (posição: " + posicaoMenor + ")");
    }
}