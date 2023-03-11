import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/* Fac¸a um programa que leia o valor de um produto e imprima o valor com desconto, tendo
em vista que o desconto foi de 12% */

public class Desconto12_ex37 {

    public static void main(String[] args) {

        double produtototal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto: "));
        double desconto = produtototal * 12 / 100;
        double total = produtototal - desconto;

        String conversao = new DecimalFormat(".##").format(total);

        JOptionPane.showMessageDialog(null, "Valor do produto (R$" + produtototal + ") com desconto: R$" + conversao);
    }
}
