/* Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de ´
seu dobro.
 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class ex32 {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor: "));
        double op = (Math.pow(num, 2) - 1) + (Math.pow(num, 3) + 1);

        System.out.println(op);
    }

}
