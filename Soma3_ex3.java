import javax.swing.JOptionPane;
public class Soma3_ex3 {

    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));

        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro valor: "));

        int soma = num1 + num2 + num3;

        JOptionPane.showMessageDialog(null, "O valor da soma dos três valores é: "+soma);
    }
    
}
