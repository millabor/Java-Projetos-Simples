import javax.swing.JOptionPane;

/* . Uma empresa contrata um encanador a R$ 30,00 por dia. Fac¸a um programa que solicite
o numero de dias trabalhados pelo encanador e imprima a quantia l ´ ´ıquida que devera ser ´
paga, sabendo-se que sao descontados 8% para imposto de renda.  */

public class Encanador_ex40 {

    public static void main(String[] args){

        int Dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tanto de dias que o encanador irá trabalhar"));
        double pagamento = 30 * Dias;
        double imposto = pagamento - (pagamento * 8 / 100);

        JOptionPane.showMessageDialog(null, "A quantia líquida a ser paga, com descontos, é R$"+imposto);
    }
    
    
}
