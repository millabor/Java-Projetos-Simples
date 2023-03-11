/*  Leia quatro notas, calcule a media aritm ´ etica 
e imprima o resultado. */

import javax.swing.JOptionPane;

public class MediaDe4_ex29 {

    public static void main(String[] args){

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        double num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta valor: "));
        double op = (num1+num2+num3+num4)/4;

        JOptionPane.showMessageDialog(null,"O valor da média das notas e "+op);
    }
}
