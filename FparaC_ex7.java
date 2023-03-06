import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class FparaC_ex7 {
    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog(null, "Digite o valor de Fahreinheit: ");
        double F = Double.parseDouble(st1);
        double FparaC = ((F - 32) / 9) * 5;

        String a = new DecimalFormat("#.##").format(FparaC); //formata quantas casas decimais são desejadas.

        JOptionPane.showMessageDialog(null, "O valor de " + F + "°F para Celsius é " + a);
    }

}
