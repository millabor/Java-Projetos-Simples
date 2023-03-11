/* Leia um valor de comprimento em cent´ımetros e apresente-o convertido em polegadas.
A formula de convers ´ ao˜ e: ´ P = C / 2,54 , sendo C o comprimento em cent´ımetros e P o
comprimento em polegadas. */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CParaPoleg_ex17 {

    public static void main(String[] args) {

        String cm = JOptionPane.showInputDialog(null, "Digite o valor em centimetros: ");
        double polegadas = (Double.parseDouble(cm) / 2.54);

        String conversao = new DecimalFormat("#.##").format(polegadas);

        JOptionPane.showMessageDialog(null, "O valor de " + cm + " cm em polegadas e " + conversao);
    }

}
