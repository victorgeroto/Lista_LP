import javax.swing.*;

public class Exercicio17 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade inicial (m/s): "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a aceleração (m/s): "));
        double Num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo (s): "));
        double Num4 = (( Num1 + Num2 *Num3 ));

        System.out.println("A velocidade é " + "m/s" + (Num4));
    }
}