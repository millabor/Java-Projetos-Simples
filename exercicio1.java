/* A distancia entre 2 pontos P1(x1, y1) e P2(x2,y2) e dado por raiz de (x1 - x2)² + (y1 - y2)².
 * Ler coordenadas de P1 e P2
 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class exercicio1 {

    public static void main(String[] args){

        double p1x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a abcissa (x) de primeiro ponto: "));
        double p1y = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a ordenada (y) do primeiro ponto (x,y): "));
        double p2x = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a abcissa (x) de segundo ponto: "));
        double p2y = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a ordenada (y) de segundo ponto: "));
        double distancia = Math.sqrt(Math.pow((p1y-p2y),2)) + Math.sqrt(Math.pow((p1x - p2x),2));

        JOptionPane.showMessageDialog(null, "O valor das coordenadas de P1 são ("+p1x+", "+p1y+") e as coordenadas de P2 são ("+p2x+", "+p2y+"). Logo, a distancia e: "+distancia);



    }
}