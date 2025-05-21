import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {
                "",
                "domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"
        };

        System.out.println("Digite um número entre 1 e 7: ");
        int number = scanner.nextInt();

        if(number >=1 && number<=7){
            System.out.println("O dia correspondente é: " +days[number]);
        }
        else {
            System.out.println("Número invalido!");
        }
    }
}