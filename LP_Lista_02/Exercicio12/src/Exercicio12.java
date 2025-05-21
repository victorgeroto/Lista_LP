import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a primeira nota: "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Me fale a segunda nota para tirar a média: "));
        double Num3 = ((Num1 * 1) + (Num2 * 2));


        System.out.println("A média entre as duas notas são = "+ (Num3/3));
    }
}