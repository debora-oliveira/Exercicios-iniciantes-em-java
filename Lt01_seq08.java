/*Objetivo      : Receba o valor de um depósito em poupança.
                  Calcule e mostre o valor após 1 mês de 
                  aplicação sabendo que rende 1,3% a. m.
                  Este código fonte será salvo no arquivo
                  Lt01_seq08.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq08 {
    public static void main (String args[]){
        double dep, poup;
        dep = Double.parseDouble(JOptionPane.showInputDialog
                                                ("Digite valor de depósito: "));
        poup = dep +((dep/100)*1.3);
        System.out.printf("Valor após um mês será de %.2f \n" ,poup);
    }
    
}
