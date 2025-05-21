import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a base do Triangulo: "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Agora me fale o valor da sua altura: "));
        double Num3 = (Num1*Num2);

        System.out.println("A área do Triangulo é = " + (Num3/2));
    }
}