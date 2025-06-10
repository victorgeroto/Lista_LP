public class Main {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Cria o segundo vetor com o mesmo tamanho
        int[] v2 = new int[v1.length];

        // Copia os valores de v1 para v2 em ordem invertida
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        // Exibe o primeiro vetor
        System.out.println("Vetor original (v1):");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

        // Exibe o segundo vetor (invertido)
        System.out.println("\nVetor invertido (v2):");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
    }
}