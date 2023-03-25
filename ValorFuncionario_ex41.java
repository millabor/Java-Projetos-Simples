/* Fac¸a um programa que leia o valor da hora de trabalho (em reais) e numero de horas ´
trabalhadas no mes. Imprima o valor a ser pago ao funcion ˆ ario, adicionando 10% sobre ´
o valor calculado.
 */

//import java.util.Scanner; //modo 1
import javax.swing.JOptionPane; //mod2

public class ValorFuncionario_ex41 {

    public static void main(String[] args) {

        double valorHora, pago, total;
        int horasMes;

        /*
         * MODO 1
         * 
         * Scanner scanner = new Scanner(System.in);
         * System.out.printf("Digite o valor da hora de trabalho: ");
         * valorHora = scanner.nextDouble();
         * 
         * System.out.printf("Digite horas foram trabalhadas este mes: ");
         * horasMes = scanner.nextInt();
         * 
         * pago = valorHora * horasMes;
         * total = pago + (pago * 0.10);
         * 
         * System.out.printf( "O valor que deve ser pago é " +total);
         * 
         * scanner.close();
         */

        // MODO 2

        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora trabalhada: "));
        horasMes = Integer.parseInt(JOptionPane.showInputDialog("Valor da hora trabalhada: "));
        pago = valorHora * horasMes;
        total = pago + (pago * 10 / 100);

        JOptionPane.showMessageDialog(null, "O valor que deve ser pago é " + total);

    }
}
