/* Leia um valor de area em metros quadrados ´ m2 e apresente-o convertido em acres. A
formula de convers ´ ao˜ e: ´ A = M ∗ 0, 000247, sendo M a area em metros quadrados e ´ A
a area em acre */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MQuadParaAcre_ex24 {

    public static void main(String args[]) {

        String M = JOptionPane.showInputDialog(null, "Digite o valor em metros quadrados: ");
        double acre = Double.parseDouble(M) * 0.000247;

        String conversao = new DecimalFormat("#.##").format(acre);

        JOptionPane.showMessageDialog(null, "O valor de " + M + " metro(s) quadrados, em acres, e " + conversao);
    }
}
