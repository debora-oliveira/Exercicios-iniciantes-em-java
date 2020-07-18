/*Objetivo      : Receba um número.
                  Calcule e mostre os resultados da tabuada desse número.
                   Este código fonte será salvo no arquivo
                   Lt01_rep34.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep34 {
    public static void main(String args[]){
        int res, num, cont=1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        while (cont<=10){
            res = num*cont;
            System.out.println(num + " X " + cont + " = " + res);
            cont++;
        }
    }
    
}
