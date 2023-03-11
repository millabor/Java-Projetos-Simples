/* Sejam a e b os catetos de um triangulo, onde a hipotenusa ˆ e obtida pela equac¸ ´ ao: ˜
hipotenusa =
√a^2 + b^2. Fac¸a um programa que receba os valores de a e b e calcule
o valor da hipotenusa atraves da equac¸ ´ ao. Imprima o resultado dessa operac¸ ˜ ao. */

import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;

public class Hipotenusa_ex35 {

    public static void main(String[] args) {

        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do primeiro cateto do triangulo: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do segundo cateto do triangulo: "));
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        String conversao = new DecimalFormat(".##").format(hipotenusa);

        JOptionPane.showMessageDialog(null, "A hipotenusa do triangulo e: " + conversao);

    }
}
