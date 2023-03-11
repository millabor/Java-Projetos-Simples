
/* A importancia de R$ 780.000,00 ser ˆ a dividida entre tr ´ es ganhadores de um concurso. ˆ
Sendo que da quantia total:
• O primeiro ganhador recebera 46%; ´
• O segundo recebera 32%; ´
• O terceiro recebera o restante; ´
Calcule e imprima a quantia ganha por cada um dos ganhadores */

public class Premio_ex39 {

    public static void main(String[] args) {

        int valor = 780000;
        double ganhador1 = valor * 46 / 100;
        double ganhador2 = valor * 32 / 100;
        double ganhador3 = valor - (ganhador1 + ganhador2);

        System.out.println("O primeiro ganhador ganha: R$" + ganhador1 + "; o segundo: R$" + ganhador2
                + "; e o terceiro: R$" + ganhador3);
    }

}
