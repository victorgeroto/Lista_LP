import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale uma medida de distância em milhas para a conversão em quilômetros: "));

        System.out.println("A conversão de Milhas para quilômetros  é = "+ (Num1*1.609));
    }
}