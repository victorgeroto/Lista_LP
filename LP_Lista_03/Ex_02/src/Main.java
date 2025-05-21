import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double n1, n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de um numero real: ");
        n1 = in.nextDouble();

        System.out.println("Digite o valor de outro numero real: ");
        n2 = in.nextDouble();

        if (n1>n2){
            System.out.println("O numero maior é o primeiro: " +n1);
        }
        else if (n2>n1){
            System.out.println("O numero maior é o segundo: "+n2);
        }

    }
}