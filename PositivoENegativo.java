import java.util.Scanner;

public class PositivoENegativo {

    public static void main(String[] args) {

        char numero;
        String auxiliar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor (positivo ou negativo): "); // pedindo n
        auxiliar = scanner.next();
        numero = auxiliar.charAt(0);

        if (numero == '-') {
            System.out.printf(auxiliar + " e negativo");
        } else {
            System.out.printf(auxiliar + " e positivo");
        }

        scanner.close();

    }

}
