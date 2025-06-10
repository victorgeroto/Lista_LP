public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Exibe o vetor original
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Inverte o vetor usando uma variável auxiliar
        int aux;
        for (int i = 0; i < vetor.length / 2; i++) {
            // Troca o elemento da posição i com o elemento da posição oposta
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        // Exibe o vetor invertido
        System.out.println("\nVetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}