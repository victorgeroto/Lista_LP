import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();
        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Multiplicação de matrizes não é possível: o número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            scanner.close();
            return;
        }

        int[][] matrizA = new int[linhasA][colunasA];
        System.out.println("Digite os elementos da primeira matriz (" + linhasA + "x" + colunasA + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizB = new int[linhasB][colunasB];
        System.out.println("Digite os elementos da segunda matriz (" + linhasB + "x" + colunasB + "):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizProduto = new int[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizProduto[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Matriz A (" + linhasA + "x" + colunasA + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B (" + linhasB + "x" + colunasB + "):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz Produto (" + linhasA + "x" + colunasB + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizProduto[i][j] + "\t");
            }
            System.out.println();
        }
    }
}