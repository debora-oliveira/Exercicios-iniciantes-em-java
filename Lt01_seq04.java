/*Objetivo      : Receba a temperatura em graus Celsius.
                  Calcule e mostre a sua temperatura convertida em fahrenheit 
                  F = (9*C+160) /5.
                  Este código fonte será salvo no arquivo
                  Lt01_seq04.java
Programadora    : Débora Oliveira
Data            :02/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq04 {
    public static void main (String args[]){
        double f,c;
        c = Double.parseDouble(JOptionPane.showInputDialog
                        ("Digite temperatura em Celsius: "));
        f = ((9* c)+160) /5;
        System.out.printf("A temperatura em Fahrenheit é %.2f \n", f);
    }
}
