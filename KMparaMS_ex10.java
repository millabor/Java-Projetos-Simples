
/* Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s ˆ
(metros por segundo). A formula de convers ´ ao˜ e: ´ M = K/3.6, sendo K a velocidade em
km/h e M em m/s. */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class KMparaMS_ex10 {

    public static void main(String[] args) {

        String st = JOptionPane.showInputDialog(null, "Digite a velocidade em km/h: ");
        double kmh = Double.parseDouble(st);
        double ms = kmh / 3.6;

        String conversao = new DecimalFormat("#.##").format(ms);

        JOptionPane.showMessageDialog(null, "A velocidade de " + kmh + "km/h em m/s é " + conversao);

    }

}
