/* Leia um valor de area em hectares e apresente-o convertido em metros quadrados ´ m2.
 A formula de convers ´ ao˜ e: ´ M = H ∗ 10000, sendo M a area em metros quadrados e ´ H
a area em hectares. */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class HParaMQuad_ex27 {

    public static void main(String args[]) {

        String hectares = JOptionPane.showInputDialog(null, "Digite o valor da área em hectares: ");
        double M = Double.parseDouble(hectares) * 10000;

        String conversao = new DecimalFormat("#.00").format(M);

        JOptionPane.showMessageDialog(null, "O valor da área é " + conversao + " metros quadrados");
    }

}
