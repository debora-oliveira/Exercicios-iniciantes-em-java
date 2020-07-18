/*Objetivo      :Receba um número inteiro. Calcule e mostre o seu fatorial.
Programadora    :Débora Oliveira
Data            :12/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep32 {
    public static void main (String args[]){
        int fat, num, cont;
        num = Integer.parseInt(JOptionPane.showInputDialog
                                  ("Digite um número e descubra seu fatorial"));
        fat = 1;
        for (cont=num; cont>=1; cont--){
            fat =fat*cont;
        }
        System.out.println("O fatorial de " + num + " é " + fat);
    }
    
}
