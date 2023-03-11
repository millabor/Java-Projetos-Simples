/* Leia um valor de massa em libras e apresente-o convertido em quilogramas. A formula ´
de conversao˜ e: ´ K = L∗ 0, 45, sendo K a massa em quilogramas e L a massa em libras. */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class LParaKg_ex21 {

    public static void main(String[] args) {

        String libra = JOptionPane.showInputDialog(null, "Digite o valor em libras: ");
        double kg = Double.parseDouble(libra) * 0.45;

        String conversao = new DecimalFormat("#.##").format(kg);

        JOptionPane.showMessageDialog(null, "O valor de " + libra + " libra(s), em quilogramas, e " + conversao);

    }

}
