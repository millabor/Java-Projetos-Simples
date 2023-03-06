
/* Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h
(quilometros por hora). A f ˆ ormula de convers ´ ao˜ e: ´ K = M ∗ 3.6, sendo K a velocidade
em km/h e M em m/s.
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MSparaKM_ex11 {

    public static void main(String[] args) {

        String st = JOptionPane.showInputDialog(null, "Digite o valor em m/s: ");
        double ms = Double.parseDouble(st);
        double kmh = ms * 3.6;
        String conversao = new DecimalFormat().format(kmh);

        JOptionPane.showMessageDialog(null, "O valor de " + ms + " m/s em km/h é " + conversao);
    }

}
