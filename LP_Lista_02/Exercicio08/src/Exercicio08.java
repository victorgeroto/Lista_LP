import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale uma medida em Polegadas para a conversão em Milímetro: "));

        System.out.println("A conversão de Polegadas para Milímetro é = "+ (Num1*25.4));
    }
}