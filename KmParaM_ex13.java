/* Leia uma distancia em quil ˆ ometros e apresente-a convertida em milhas. A f ˆ ormula de ´
conversao˜ e: ´ M = K/1,61 , sendo K a distancia em quil ˆ ometros e ˆ M em milhas.  */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class KmParaM_ex13 {

    public static void main(String[] args) {

        String st = JOptionPane.showInputDialog(null, "Digite o valor em quilometros: ");
        double milhas = (Double.parseDouble(st)) / 1.61;

        String conversao = new DecimalFormat("#.##").format(milhas);

        JOptionPane.showMessageDialog(null, "O valor de " + st + " km em milhas e " + conversao);

    }

}
