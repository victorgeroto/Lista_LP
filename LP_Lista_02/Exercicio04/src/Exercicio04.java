import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a primeira nota: "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a segunda nota: "));
        double Num3 = (Num1 + Num2);

        System.out.println("A média das duas notas é = " + (Num3/2));
    }
}