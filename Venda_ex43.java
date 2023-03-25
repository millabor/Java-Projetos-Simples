/* Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
• o total a pagar com desconto de 10%;
• o valor de cada parcela, no parcelamento de 3× sem juros;
• a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com des- ˜
conto)
• a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total)  */

import java.util.Scanner;

public class Venda_ex43 {

    public static void main(String[] args) {

        double valor, desconto10, parcela3, comissaovista, comissaoparcelada;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        valor = scanner.nextDouble();

        desconto10 = valor - (valor * 0.10);
        parcela3 = valor / 3;
        comissaovista = desconto10 * 0.05;
        comissaoparcelada = valor * 0.05;

        System.out.print("Total a pagar com desconto de 10%: " + String.format("%.2f", desconto10) +
                "\nValor de cada parcela (3x sem juros do valor total): " + String.format("%.2f", parcela3) +
                "\nComissão do vendedor em venda à vista (5%): " + String.format("%.2f", comissaovista) +
                "\nComissão do vendedor no caso de venda parcelada: " + String.format("%.2f", comissaoparcelada));

        scanner.close();

    }

}
