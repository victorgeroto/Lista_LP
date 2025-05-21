import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, aux;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros separados por espaço: ");
        number1 = in.nextInt();
        number2 = in.nextInt();

        if(number1>number2){
            aux = number1;
            number1 = number2;
            number2 = aux;
        }
        for (int i=number1; i<number2; i++)
            System.out.println(i + "");
    }
}
