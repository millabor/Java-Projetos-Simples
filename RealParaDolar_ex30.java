/*  Leia um valor em real e a cotac¸ao do d ˜ olar. Em seguida, imprima o valor correspondente ´
em dolares */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class RealParaDolar_ex30 {

    public static void main(String[] args) {

        double cotacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a cotação atual do dólar: "));
        double real = Double
                .parseDouble(JOptionPane.showInputDialog("Digite o valor que quer converter para dólar (real): "));
        double op = real / cotacao;

        String conversao = new DecimalFormat("#.##").format(op);

        JOptionPane.showMessageDialog(null, "R$" + real + " reais e igual a $" + conversao + " dolares");
    }

}
