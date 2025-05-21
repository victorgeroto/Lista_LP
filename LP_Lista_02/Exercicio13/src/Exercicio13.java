import javax.swing.JOptionPane;

public class Exercicio13 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale o raio de um circulo para descobrir sua área: "));
        double Num2 = ((Math.pow(Num1,2)));

        System.out.println("A área do circulo é = "+ (Num2*Math.PI));
    }
}