import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira o dinheiro: ");
        double n1, result;
        int option;

        Scanner in =  new Scanner(System.in);
        n1 = in.nextDouble();

        System.out.println("----------------------" +
                "\n MENU" +
                "\n------------------------"+
                "\n1. Café Expresso R$ 0,50" +
                "\n2. Café Longo R$ 1,00"+
                "\n3. Capuccino R$ 2,50"+
                "\n4. Chocolate R$ 2,00"+
                "\n------------------------");
        System.out.println("Escolha uma opção:"+
                "\n--------------------------");

        option = in.nextInt();

        switch (option){
            case 1:
                result = n1 - 0.50;
                System.out.println("Bebida selecionada: Café Expresso" +
                        "\n Seu Troco:" + result);
                break;
            case 2:
                result = n1 - 1.0;
                System.out.println("Bebida selecionada: Café Longo" +
                        "\nSeu Troco:" + result);
                break;
            case 3:
                result = n1 - 2.50;
                System.out.println("Bebida selecionada: Capuccino" +
                        "\n Seu Troco:" + result);
                break;
            case 4:
                result = n1 - 2.0;
                System.out.println("Bebida selecionada: Chocolate" + "\n " +
                        "Seu Troco:" + result);
                break;
        }
    }
}