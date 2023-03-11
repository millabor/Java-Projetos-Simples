/* Leia um valor de area em acres e apresente-o convertido em metros quadrados ´ m2
. A formula de convers ´ ao˜ e: ´ M = A ∗ 4048, 58, sendo M a area em metros quadrados e ´ A a
area em acres */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AcreParaMQuad_java25 {

    public static void main(String args[]) {

        String acre = JOptionPane.showInputDialog(null, "Digite o valor em acres: ");
        double M = Double.parseDouble(acre) * (4048.58);

        String conversao = new DecimalFormat("#.00").format(M);

        JOptionPane.showMessageDialog(null, "O valor de " + acre + " acres, em metro(s) quadrados, e " + conversao);
    }

}
