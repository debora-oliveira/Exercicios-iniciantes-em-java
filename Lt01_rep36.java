/*Objetivo      : Receba um número N. Calcule e mostre a série          
                  1+1/1!+1/2!+...+1/N!
                   Este código fonte será salvo no arquivo
                   Lt01_rep36.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep36 {
    public static void main(String[] args){
        double num, cont, fat=0, sSerie=1;
        num = Double.parseDouble(JOptionPane.showInputDialog
                                                        ("Digite um número"));
        for (cont=1; cont<=num; cont++){
            fat = fat+cont;
            sSerie += (1/fat);
            System.out.println(sSerie );
        }
        System.out.printf("A soma da série será %.2f \n", sSerie);
    }
}
