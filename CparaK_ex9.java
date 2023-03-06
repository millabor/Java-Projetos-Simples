/* Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
formula de convers ´ ao˜ e:´ K = C + 273.15, sendo C a temperatura em Celsius e K a
temperatura em Kelvin.
 */

import javax.swing.JOptionPane;

public class CparaK_ex9 {

    public static void main(String[] args) {

        String st = JOptionPane.showInputDialog(null, "Digite o valor em Celsius");

        double C = Double.parseDouble(st);

        double K = C + 273.15;

        JOptionPane.showMessageDialog(null, "O valor de " + C + "°C em Kelvin é " + K);
    }
}
