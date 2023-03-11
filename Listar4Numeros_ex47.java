/* Usuário deve informar 4 números e, COM SCANNER, leia o valor e coloque seus 4 dígitos separadamente */

import java.util.Scanner;
public class Listar4Numeros_ex47 {
    public static void main(String[] args){ 

        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro com quatro dígitos: ");
        numero = scanner.nextInt();

        int num1 = numero % 10; //ultimo digito
        int num2 = numero / 10 % 10 ; //penultimo digito
        int num3 = numero / 100 % 10 ; //antepenultimo digito
        int num4 = numero / 1000 % 10 ; //antepenultimo digito

        System.out.println("Primeiro dígito: "+num4+
        "\n Segundo dígito: "+num3+
        "\n Terceiro dígito: "+ num2+
        "\n Quarto dígito: "+num1);

        scanner.close();

    }
    
}
