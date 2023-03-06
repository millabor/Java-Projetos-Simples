import java.text.DecimalFormat; //MODO 3
import javax.swing.JOptionPane;
import java.lang.Math; //MODO 2 E 3
//import java.text.NumberFormat; MODO 2

public class TesteFormDecimais {

    public static void main(String[] args) {

        String st1 = JOptionPane.showInputDialog(null, "Digite o valor: ");
        double n = Double.parseDouble(st1);

        /* double quadrado = n * n; MODO 1, sai formatado com duas casas decimais 
         *
         * JOptionPane.showMessageDialog(null, "O valor de " + st1 + " ao quadrado é " + quadrado); 
         * 
        */
       
        /*double op = Math.pow(n, 2); // MODO 2 
         
         NumberFormat.getNumberInstance().format(op); //formatando valor com NumberFormat
          
         JOptionPane.showMessageDialog(null, "O valor de " + st1 + " ao quadrado é " + op);
         */

        double op = Math.pow(n, 2); //MODO 3
        
        String a = new DecimalFormat("#.##").format(op); //MODO 3 FORMATANDO VALOR C DECIMALFORMAT

        JOptionPane.showMessageDialog(null, "O valor de " + st1 + " ao quadrado é " + a); 

    }

}
