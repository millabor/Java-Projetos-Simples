/* Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume
de um cilindro circular e calculado por meio da seguinte f ´ ormula: ´ V = π ∗ raio2 ∗ altura,
onde π = 3.141592.
 */

import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;

public class VolumedoCilindro_ex36 {

    public static void main(String[] args) {

        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do cilindro circular: "));
        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio do cilindro circular: "));
        double volume = (Math.PI * Math.pow(raio, 2)) * altura;

        String conversao = new DecimalFormat(".##").format(volume);

        JOptionPane.showMessageDialog(null, "O volume do cilindro circular e: " + conversao);

    }

}
