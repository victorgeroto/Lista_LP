import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) {

        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Me fale o raio de um Cone: "));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Agora me fale o valor de sua altura: "));
        double Num3 = ((Math.pow(Num1,2)*(Num2*0.3333)));

        System.out.println("A volume do Cone é = " + (Num3*3.14));
    }
}