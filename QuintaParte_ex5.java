import java.text.DecimalFormat; //biblioteca de formatar decimais

public class QuintaParte_ex5 {

    public static void main(String[] args) {

        double n = 9.5;

        double quintaparte = n / 5;

        String a = new DecimalFormat("#,##.00").format(quintaparte); // formatar valor
        /*
         * # representa dígitos, 0 as casas fixas, q sao 0 caso n tenha. Pode usar . e ,  
         * Obrigatório uso de 3 combos: a,bbb.cc
         */

        System.out.println(a);
    }

}
