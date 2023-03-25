import javax.swing.JOptionPane;

public class Desconto {
    public static void main(String[] args) {
        double PrecoProduto = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto: "));
        double ValorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do desconto: "));
        double Desconto = (ValorDesconto / 100) * PrecoProduto;
        double precoFinal = PrecoProduto - Desconto;

        JOptionPane.showMessageDialog(null, "O preco final do produto é: " + precoFinal);

    }
}
