/* . Leia um valor de comprimento em polegadas e apresente-o convertido em cent´ımetros.
A formula de convers ´ ao˜ e:´ C = P ∗ 2, 54, sendo C o comprimento em cent´ımetros e P o
comprimento em polegadas */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PolegParaCm_ex16 {

    public static void main(String[] args) {

        String polegadas = JOptionPane.showInputDialog(null, "Digite o valor das polegadas: ");
        double cm = (Double.parseDouble(polegadas) * 2.54);

        String conversao = new DecimalFormat("#.##").format(cm);

        JOptionPane.showMessageDialog(null, "O valor de " + polegadas + " polegadas em centimetros e " + conversao);
    }

}
