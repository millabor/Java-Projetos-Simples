/* Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de ´
seu dobro.
 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class AQuadrado_ex33 {

    public static void main(String[] args) {

        double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado do quadrado: "));
        double op = Math.pow(lado, 2);

        JOptionPane.showMessageDialog(null, "O valor da área do quadrado é: " + op);

    }
}
