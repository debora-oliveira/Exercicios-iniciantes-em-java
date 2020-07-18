/*Objetivo      : Receba um número. Calcule e mostre a série 
                   1 + 1/2 + 1/3 + ... + 1/N.
                   Este código fonte será salvo no arquivo
                   Lt01_rep33.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep33 {
    public static void main(String args[]){
        double cont, num,serie;
        num = Double.parseDouble(JOptionPane.showInputDialog
                                                         ("Digite um número"));
        for (cont = 1;cont<=num; cont++){
            serie = (1/cont);
             System.out.printf("%.2f \n" , serie);
        }
           
    }
    
}
