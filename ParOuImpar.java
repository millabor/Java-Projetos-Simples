import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: "); // pedindo n
        numero = scanner.nextInt();

        if (numero % 2 == 0) { //resto de numero dividido e 0
            System.out.printf(numero + " e par");
        } else {
            System.out.printf(numero + " e impar");
        }

        scanner.close();
    
    }

}
