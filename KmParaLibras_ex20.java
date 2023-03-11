
/* . Leia um valor de massa em quilogramas e apresente-o convertido em libras. A formula ´
de conversao˜ e:´ L = K/0,45 , sendo K a massa em quilogramas e L a massa em libras.*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class KmParaLibras_ex20 {

    public static void main(String[] args) {

        String kg = JOptionPane.showInputDialog(null, "Digite o valor em quilogramas: ");
        double libras = Double.parseDouble(kg) / 0.45;

        String conversao = new DecimalFormat("###.##").format(libras);

        JOptionPane.showMessageDialog(null, "" + kg + "kg em libras e " + conversao);

    }

}
