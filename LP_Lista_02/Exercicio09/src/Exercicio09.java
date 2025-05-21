import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale uma medida de distância em quilômetros para a conversão em milhas: "));

        System.out.println("A conversão de quilômetros  para Milhas é = "+ (Num1/1.609));
    }
}