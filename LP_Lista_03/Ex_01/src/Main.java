import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Double n, sqrt;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de um numero real: ");
        n = in.nextDouble();

        if (n>0){
            sqrt = Math.sqrt(n);
            System.out.println("A raiz do numero " + n + " é " + sqrt);
        }
        else{
            System.out.println("Valor inválido!");
        }
    }
}