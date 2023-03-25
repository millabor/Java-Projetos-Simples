import java.util.Scanner;

public class MaiorEntreTres {

    public static void main(String[] args) {

        double n1, n2, n3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor 1: "); // pedindo n1
        n1 = scanner.nextDouble();
        System.out.print("Digite o valor 2: "); // pedindo n2
        n2 = scanner.nextDouble();
        System.out.print("Digite o valor 3: "); // pedindo n3
        n3 = scanner.nextDouble();

        if (n1 >= n2 && n1 >= n3) { // resto de numero dividido e 0
            System.out.printf(n1 + " e o maior");
        } else if (n2 >= n3) {
            System.out.printf(n2 + " e o maior");
        } else {
            System.out.printf(n3 + " e o maior");

        }

        scanner.close();

    }

}
