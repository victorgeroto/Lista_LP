import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));

        System.out.println("O dobro desse numero é = " + (Num1 * 2));
    }
}