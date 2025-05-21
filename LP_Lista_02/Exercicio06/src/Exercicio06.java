import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a velocidade em M/s para a conversão: "));

        System.out.println("A conversão de M/s em Km/h é = " + (Num1*3.6));
    }
}