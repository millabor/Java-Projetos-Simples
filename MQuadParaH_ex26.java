/* Leia um valor de area em metros quadrados ´ m2 e apresente-o convertido em hectares.
A formula de convers ´ ao˜ e:´ H = M ∗ 0, 0001, sendo M a area em metros quadrados e ´ H
a area em hectares.  */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MQuadParaH_ex26 {

    public static void main(String args[]) {

        String M = JOptionPane.showInputDialog(null, "Digite o valor da área em metros quadrados: ");
        double hectares = Double.parseDouble(M) * (0.0001);

        String conversao = new DecimalFormat("##.##").format(hectares);

        JOptionPane.showMessageDialog(null, "O valor da área e " + conversao + " hectares");
    }

}
