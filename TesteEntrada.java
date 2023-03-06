import javax.swing.JOptionPane;

public class TesteEntrada {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome: ");
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome);

    }

}