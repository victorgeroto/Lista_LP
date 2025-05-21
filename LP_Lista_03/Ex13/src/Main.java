import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("--------------------------------");
        System.out.println("Bem-Vindo ao calculador de area e perimetro!!");
        System.out.println("--------------------------------");
        System.out.println("Menu:");
        System.out.println("    1 - circulo");
        System.out.println("    2 - triangulo retangulo");
        System.out.println("    3 - retangulo");
        System.out.println("    4 - Sair");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma opção: ");
        int value = scanner.nextInt();

        double base = 0;
        double height = 0;

        switch (value){
            case 1:
                System.out.print("Informe o raio do circulo: ");
                double radius = scanner.nextDouble();
                System.out.println("A area do circulo é: " +(Math.PI * Math.pow(radius,2)));
                System.out.println("O perimetro do circulo é: "+ (2 * Math.PI * radius));
                break;

            case 2:
                System.out.print("Informe o primeiro cateto: ");
                double a = scanner.nextDouble();

                System.out.print("Informe segundo cateto: ");
                double b = scanner.nextDouble();
                //calculo hipotenusa
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                System.out.println("A area do triangulo é: "+ ((a * b)/2));
                System.out.println("O perimetro é: "+ (a + b + c));
                break;
            case 3:
                System.out.print("Informe a base: ");
                base = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                height = scanner.nextDouble();

                System.out.println("A area é: " + (base * height));
                System.out.println("O perimetro é: "+ (base + base + height + height));
                break;
            default:
                break;
        }

    }
}