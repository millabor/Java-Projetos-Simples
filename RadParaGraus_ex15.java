/* Leia um angulo em radianos e apresente-o convertido em graus. A f ˆ ormula de convers ´ ao˜
e: ´ G = R ∗ 180/π, sendo G o angulo em graus e ˆ R em radianos e π = 3.14.
 */

import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;

public class RadParaGraus_ex15 {

    public static void main(String[] args0) {

        String st = JOptionPane.showInputDialog(null, "Digite o valor de radianos: ");
        double rad = Double.parseDouble(st);
        // double op = graus * (3.14/180); MODO 1
        double op = rad * (180 / Math.PI);

        String conversao = new DecimalFormat("#.###").format(op);

        JOptionPane.showMessageDialog(null, "O valor de " + rad + " radianos em graus e " + conversao);

    }

}
