import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));

        System.out.println("O valor da quinta parte desse numero é = " + (Num1/5));
    }
}