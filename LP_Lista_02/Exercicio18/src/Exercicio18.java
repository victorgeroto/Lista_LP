import javax.swing.*;

public class Exercicio18 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente angular: "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente linear: "));
        double Num3= ((-Num2/Num1));

        System.out.println("O valor de X é " + (Num3));
    }
}