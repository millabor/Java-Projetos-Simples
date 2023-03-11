/* Leia um valor de volume em litros e apresente-o convertido em metros cubicos ´ m3
. A formula de convers ´ ao˜ e: ´ M = L / 1000 , sendo L o volume em litros e M o volume em metros
cubicos.  */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class LparaMCub_ex19 {

    public static void main(String[] args) {

        String L = JOptionPane.showInputDialog(null, "Digite o valor em litros: ");
        double M = (Double.parseDouble(L)) / 1000;

        String conversao = new DecimalFormat("#.###").format(M);

        JOptionPane.showMessageDialog(null, "O valor de " + L + " litros em m cubicos e " + conversao);
    }

}
