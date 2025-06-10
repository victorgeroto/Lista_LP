import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int maiorSomaLinha = Integer.MIN_VALUE;
        int linhaMaiorSoma = 0;
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
                linhaMaiorSoma = i;
            }
        }

        int maiorSomaColuna = Integer.MIN_VALUE;
        int colunaMaiorSoma = 0;
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
                colunaMaiorSoma = j;
            }
        }

        System.out.println("\nMaior soma entre as linhas: " + maiorSomaLinha + " (Linha " + linhaMaiorSoma + ")");
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna + " (Coluna " + colunaMaiorSoma + ")");
    }
}