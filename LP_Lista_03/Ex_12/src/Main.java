import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite dois numeros separados por espaço: ");
        double n1, n2, result;
        int option;

        Scanner in =  new Scanner(System.in);

        System.out.println("Digite dois numeros separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("----------------------" +
                "\n MENU" +
                "\n------------------------"+
                "\n1. soma" +
                "\n2. subtracao"+
                "\n3. multiplicaçao"+
                "\n4. Divisão"+
                "\n------------------------");
        System.out.println("Escolha uma opção:"+
                "\n--------------------------");

        option = in.nextInt();

        switch (option){
            case 1:
                result = n1 + n2;
                System.out.println(n1 + "+" + n2 + "=" + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + result);
                break;
            case 4:
                result = n1/n2;
                System.out.println(n1 + "/" + n2 + "=" + result);
                break;
        }
    }
}