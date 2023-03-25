import java.util.Scanner;

public class Encadeamento2 {

    public static void main(String[] args) {

        double valorCompra, total;
        int parcela;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        System.out.print("Digite o número de parcelas a pagar, de 1 a 3 SOMENTE: ");
        parcela = scanner.nextInt();

        if (parcela == 1) {
            total = valorCompra - (valorCompra * 0.10);
            System.out.println("O valor total a ser pago, à vista, é R$" + String.format("%.2f", total));
        } else if (parcela == 2) {
            total = valorCompra / 2;
            System.out.println("O valor total a ser pago, parcelado pra 2, é R$" + String.format("%.2f", total));
        } else if (parcela == 3) {
            total = (valorCompra * 0.10) + valorCompra;
            System.out.println("O valor total a ser pago, parcelado pra 3 e com 10% de acrescimo, é R$"
                    + String.format("%.2f", total / 3));
        } else {
            System.out.println("Valor de parcela não aceito. Deve ser de 1 até 3 no máximo.");

        }

        scanner.close();

    }

}
