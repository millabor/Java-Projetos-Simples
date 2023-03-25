import java.util.Scanner;

/* Fac¸a um programa que leia um numero inteiro positivo de tr ´ es d ˆ ´ıgitos (de 100 a 999).
Gere outro numero formado pelos d ´ ´ıgitos invertidos do numero lido. Exemplo:  */

public class NumInverso_ex46 {

    public static void main(String[] args) {

        String tresdigitos;
        int contrario1, contrario2, contrario3;
        int tresdigitosint;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 3 dígitos: ");
        tresdigitos = scanner.next();
        tresdigitosint = Integer.parseInt(tresdigitos);

        if (3 != tresdigitos.length()) {
            System.out.printf("Insira um valor SOMENTE com tres digitos. Tente novamente.");
        } else {
            contrario1 = tresdigitosint % 10;
            contrario2 = tresdigitosint / 10 % 10;
            contrario3 = tresdigitosint / 100 % 10;
            System.out.print(contrario1 + "" + contrario2 + "" + contrario3);
        }

        scanner.close();
    }
}
