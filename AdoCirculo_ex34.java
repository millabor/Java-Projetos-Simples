/* . Leia o valor do raio de um c´ırculo e calcule e imprima a area do c ´ ´ırculo correspondente.
A area do c ´ ´ırculo e´ π ∗ raio^2
, considere π = 3.141592. */

import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;

public class AdoCirculo_ex34 {

    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: "));
        double op = Math.pow(raio, 2) * Math.PI;

        String conversao = new DecimalFormat("#.##").format(op);

        JOptionPane.showMessageDialog(null, "A area do circulo e: " + conversao);

    }

}
