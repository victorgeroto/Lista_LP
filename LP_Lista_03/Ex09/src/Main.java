import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro lado: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double b = in.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        double c = in.nextDouble();

        if ((a < b + c && a > Math.abs(b - c)) &&
                (b < a + c && b > Math.abs(a - c)) &&
                (c < a + b && c > Math.abs(a - b))) {

            if (a == b && b == c) {
                System.out.println("É um triangulo equilatero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("É um triangulo isoceles..");
            } else {
                System.out.println("É um triangulo escaleno.");
            }
        } else {
            System.out.println("The given sides do NOT form a triangle.");
        }
    }
}