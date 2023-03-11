
/* Leia um valor de volume em metros cubicos ´ m3 e apresente-o convertido em litros. A
formula de convers ´ ao˜ e:´ L = 1000 ∗ M, sendo L o volume em litros e M o volume em
metros cubicos. */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MCubParaL_ex18 {

    public static void main(String[] args){

        String st = JOptionPane.showInputDialog(null, "Digite o valor em metros cubicos: ");
        double m = (Double.parseDouble(st)) * 1000;

        String conversao = new DecimalFormat("#.##").format(m);

        JOptionPane.showMessageDialog(null, "O valor de " + st + " m cubicos em litros e " + conversao);


    }
}
