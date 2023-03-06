
/* Leia uma distancia em milhas e apresente-a convertida em quil ˆ ometros. A f ˆ ormula de ´
conversao˜ e: ´ K = 1, 61 ∗ M, sendo K a distancia em quil ˆ ometros e ˆ M em milhas. */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MilhasParaKm_ex12 {

    public static void main(String[] args) {

        String st = JOptionPane.showInputDialog(null, "Digite o valor em milhas: ");
        double m = Double.parseDouble(st);
        double km = 1.61 * m;
        String conversao = new DecimalFormat(".###").format(km);

        JOptionPane.showMessageDialog(null, "O valor de " + m + " milhas em quilometros e " + conversao);
    }

}
