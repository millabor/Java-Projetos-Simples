/* Tenha dados com altura e sexo de uma pessoa. Calcule seu peso ideal. 
 * 
 * Para homens: (72.7 * h) - 58
 * Para mulheres: (62.1 * h) - 58
 * 
 * h (altura) = double
 * sexo = char (F ou f para mulher, M ou m para homens)
*/

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {

        double h, pI;
        char sexo;
        // String auxiliar; (MODO 1 - QUEBRADINHO)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: "); // pedindo altura
        h = scanner.nextDouble();

        System.out.print("Digite M/m para masculino e F/f para feminino: ");
        // auxiliar = scanner.next();
        // sexo = auxiliar.charAt(0); //CHARAT PEGA O CARACTERECE NA POSICAO DETERMINADA
        // (modo 1).
        sexo = scanner.next().charAt(0);

        if (sexo == 'm' || sexo == 'M') {
            pI = (72.7 * h) - 58;
            System.out.printf("Seu peso ideal é " + String.format("%.2f", pI));
        } else if (sexo == 'f' || sexo == 'F'){
            pI = (62.1 * h) - 44.7;
            System.out.printf("Seu peso ideal é " + String.format("%.2f", pI));
        } else {
            System.out.printf("SOMENTE digite M/m para masculino e F/f para feminino!");
        }

        
        scanner.close();
    }

}
