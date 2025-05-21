import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, total;
        int option, installment;

        Scanner in =  new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        value = in.nextDouble();

        System.out.println("---------------------------------" +
                "\nMenu: " +
                "\n1. Débito: " +
                "\n2. Pix: " +
                "\n3. Crédito: " +
                "\n------------------" +
                "Escolha uma Opção: ");
        option = in.nextInt();

        switch (option){
            case 1:
                total = value * 0.95;
                System.out.println("Debito Selecionado");
                System.out.println("Valor da Compra = " + value + "Desconto = "+ (value * 0.05));
                System.out.println("Valor final da compra = " + total);
                break;
            case 2 :
                total = value * 0.9;
                System.out.println("Pix Selecionado");
                System.out.println("Valor da Compra = " + value + " Desconto = "+ (value * 0.1));
                System.out.println("Valor final da compra = " + total);
                break;
            case 3 :
                System.out.println("Informe a quantidade de parcela: (Max:10)");
                installment = in.nextInt();

                if (installment >10 || installment <=0) {
                    System.out.println("Quantidade de parcelas invalidas");
                    break;
                }
                if (installment<=4){
                    total = value * 1.02;
                    System.out.println("Quantidade de parcelas: " + installment);
                    System.out.println("Taxa = " + (value * 0.02));
                    System.out.println("valor total da compra: " + total);
                    break;
                }

                total = value * 1.05;
                System.out.println("Quantidade de parcelas = " + installment);
                System.out.println("Taxa = " + value * 0.05);
                System.out.println("Valor Total da compra = " +total);
                break;
            default:
                System.out.println("Opção Inválida no menu");
                break;
        }
    }
}