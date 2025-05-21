import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale uma temperatura em celsius para a conversão em fahrenheit: "));

        System.out.println("A conversão de celsius para fahrenheit  é = "+ (Num1*9/5 + 32));
    }
}