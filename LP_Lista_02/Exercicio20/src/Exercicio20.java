
import javax.swing.*;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        double b,c,x1,x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da primeira Raiz (X1): ");
        x1 = in.nextDouble();

        System.out.println("Digite o valor da segunda Raiz (X2): ");
        x2 = in.nextDouble();

        b = -x1 -x2;
        c = -x1 * -x2;
        System.out.println("x² + "+ b +"x +"+ c + " = 0");
    }
}