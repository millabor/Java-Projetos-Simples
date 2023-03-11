import javax.swing.JOptionPane;

/* Leia um numero inteiro e imprima o seu antecessor e o seu sucessor */

public class AntESuc_ex31 {

    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog(null, "Digite o valor: ");
        int num1 = Integer.parseInt(st1);
        int suc = num1 + 1;
        int ant = num1 - 1;

        JOptionPane.showMessageDialog(null, "Valor: " + num1 + ", antecessor dele: " + ant + ", sucessor dele: " + suc);
    }
}
