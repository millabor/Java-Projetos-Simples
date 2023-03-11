
/* Leia um valor de comprimento em metros e apresente-o convertido em jardas. A formula ´
de conversao˜ e: ´ J = M/0,91 , sendo J o comprimento em jardas e M o comprimento em
metros.
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MParaJarda_ex23 {
    public static void main(String args[]) {

        String M = JOptionPane.showInputDialog(null, "Digite o valor em metros: ");
        double Jarda = Double.parseDouble(M) / 0.91;

        String conversao = new DecimalFormat("#.##").format(Jarda);

        JOptionPane.showMessageDialog(null, "O valor de " + M + " metro(s), em jardas, e " + conversao);

    }

}
