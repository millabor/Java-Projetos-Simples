import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;

/* Leia um angulo em graus e apresente-o convertido em radianos. A f ˆ ormula de convers ´ ao˜
e: ´ R = G ∗ π/180, sendo G o angulo em graus e ˆ R em radianos e π = 3.14.
 */

public class GrausParaRad_ex14 {
    
    public static void main(String[] args0){

        String st = JOptionPane.showInputDialog(null, "Digite o valor do angulo em graus: ");
        double graus = Double.parseDouble(st);
        // double op = graus * (3.14/180); MODO 1
        double op = graus * (Math.PI / 180);

        String conversao = new DecimalFormat("#.####").format(op);

        JOptionPane.showMessageDialog(null, "O valor de "+graus+" graus para radianos e "+conversao);


    }
}
