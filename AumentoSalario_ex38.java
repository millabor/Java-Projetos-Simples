/* . Leia o salario de um funcion ´ ario. Calcule e imprima o valor do novo sal ´ ario, sabendo que ´
ele recebeu um aumento de 25%. */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AumentoSalario_ex38 {

    public static void main(String[] args) {

        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário ATUAL funcionário: "));
        double promocao = salario * 25 / 100;
        double total = salario + promocao;

        String conversao = new DecimalFormat(".##").format(total);

        JOptionPane.showMessageDialog(null, "Valor do salário do funcionário (R$" + salario + ") e R$" + conversao+ " com o aumento");
    }
    
}
