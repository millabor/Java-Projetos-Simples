/* Fac¸a a leitura de tres valores e apresente como resultado a soma dos quadrados dos ˆ
tres valores lidos.  */

import javax.swing.JOptionPane;
import java.lang.Math;

public class SomaDosQuadrados3_ex28 {

    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        double op = Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2);
        JOptionPane.showMessageDialog(null, "A soma do quadrado dos três valores é " + op);
    }

}
