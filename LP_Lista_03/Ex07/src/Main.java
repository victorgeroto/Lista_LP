import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o coeficiente A: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        double b = in.nextDouble();

        System.out.println("Digite o coeficiente C: ");
        double c = in.nextDouble();


        double delta = Math.pow(b,2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A raiz é: x = " + x);

        } else {
            System.out.println("Não existem raízes reais.");
        }
    }
}