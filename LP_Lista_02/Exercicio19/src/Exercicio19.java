import javax.swing.*;

public class Exercicio19 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do A: "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do B: "));
        double Num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do C: "));
        double delta = (Math.pow(Num2,2)-4*Num1*Num3);
        double Num4 = ((-Num2+Math.sqrt(delta))/2*Num1);
        double Num5 = ((-Num2-Math.sqrt(delta))/2*Num1);

        System.out.println("O valor de X1 é " + (Num4));
        System.out.println("O valor de X2 é " + (Num5));
    }
}