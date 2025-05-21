import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale uma medida em milímetro para a conversão em polegadas: "));

        System.out.println("A conversão de Milímetro para Polegadas é = "+ (Num1/25.4));
    }
}