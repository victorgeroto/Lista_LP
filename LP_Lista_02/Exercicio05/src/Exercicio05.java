import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a velocidade em Km/h para a conversão: "));

        System.out.println("A conversão de Km/h em M/s é = " + (Num1/3.6));
    }
}