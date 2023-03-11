/* Leia um valor de comprimento em jardas e apresente-o convertido em metros. A formula ´
de conversao˜ e: ´ M = 0, 91 ∗ J, sendo J o comprimento em jardas e M o comprimento
em metros.
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JardaParaM_ex22 {

    public static void main(String args[]) {

        String jarda = JOptionPane.showInputDialog(null, "Digite o valor em jardas: ");
        double M = Double.parseDouble(jarda) * 0.91;

        String conversao = new DecimalFormat("#.##").format(M);

        JOptionPane.showMessageDialog(null, "O valor de " + jarda + " jarda(s), em metros, e " + conversao);

    }

}
