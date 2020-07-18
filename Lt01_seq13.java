/*Objetivo      : Receba a quantidade de alimento em quilos.
                  Calcule e mostre quantos dias durará esse alimento 
                  sabendo que a pessoa consome 50g ao dia.
                  Este código fonte será salvo no arquivo
                  Lt01_seq13.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq13 {
    public static void main (String args[]){
        int kg, dias;
        kg = Integer.parseInt(JOptionPane.showInputDialog
                                  ("Digite quantidade de alimentos em quilos"));
        dias = kg/50;
        System.out.println
                   ("Esse alimento durará " + dias + " dias se consumir 50g por dia");
    }
}
