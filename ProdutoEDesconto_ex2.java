/* Usuário atribui um valor e o valor do desconto, recebendo o preço final do produto menos o desconto */

import javax.swing.JOptionPane;
public class ProdutoEDesconto_ex2 {
    public static void main(String[] args){
        double PrecoProduto = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto: "));
        double ValorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do desconto: "));
        double Desconto = (ValorDesconto/100) * PrecoProduto;
        double precoFinal = PrecoProduto - Desconto;

        JOptionPane.showMessageDialog(null, "O preço final do produto é: " + precoFinal);

    
    }
}
