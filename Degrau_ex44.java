import java.util.Scanner;

/* . Receba a altura do degrau de uma escada e a altura que o usuario deseja alcanc¸ar ´
subindo a escada. Calcule e mostre quantos degraus o usuario dever ´ a subir para atingir ´
seu objetivo.
 */

public class Degrau_ex44 {

    public static void main(String[] args) {

        double degrau, altura;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do degrau (m): ");
        degrau = scanner.nextDouble();
        System.out.print("Digite a altura que quer alcançar (m): ");
        altura = scanner.nextDouble();
        System.out.printf("Você precisa andar " + altura / degrau + " degraus para alcançar seu objetivo");

        scanner.close();

    }

}
