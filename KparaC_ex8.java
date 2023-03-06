/*  Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
formula de conversao e: C = K − 273.15, sendo C a temperatura em Celsius e K a
temperatura em Kelvin. */
import javax.swing.JOptionPane;
public class KparaC_ex8 {
    
    public static void main(String[] args){

        String st = JOptionPane.showInputDialog(null, "Digite o valor em Kelvin");

        double K = Double.parseDouble(st);

        double C = K - 273.15;

        JOptionPane.showMessageDialog(null, "O valor de "+K+"°K em Celsius é "+C);
    }
}
