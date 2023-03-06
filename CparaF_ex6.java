import javax.swing.JOptionPane;
public class CparaF_ex6 {

    public static void main(String[] args){

        double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em Celsius: "));

        double op = (double)C * 9/5 + 32;

        JOptionPane.showMessageDialog(null, "O valor de "+C+ "°C é, em Fahrenheit, é " +op);
    }
    
}
