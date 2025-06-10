import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 12, 3, 8, 15, 7, 9, 1, 4, 10};

        // Cria um Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int numero = scanner.nextInt();

        // Realiza a busca no vetor
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break; // Sai do loop ao encontrar o valor
            }
        }

        // Exibe mensagem se o valor não foi encontrado
        if (!encontrado) {
            System.out.println("Valor não encontrado");
        }
    }
}