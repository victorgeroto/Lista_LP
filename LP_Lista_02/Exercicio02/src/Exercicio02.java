import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));

        System.out.println("O valor do numero ao quadrado é = " + (Math.pow(Num1,2)));
    }
}