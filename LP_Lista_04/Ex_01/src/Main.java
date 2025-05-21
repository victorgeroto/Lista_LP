import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite um número: ");

        int i = 1;
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        while(i<=10){
            System.out.println(number +" X "+ i+ " = "+ (number*i));
            i++;
        }


    }
}