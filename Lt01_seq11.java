/*Objetivo      : Receba o raio de uma circunferência.
                  Calcule e mostre o comprimento da circunferência.
                  Este código fonte será salvo no arquivo
                  Lt01_seq11.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq11 {
    public static void main (String args[]){
        double raio,circun;
        raio = Double.parseDouble(JOptionPane.showInputDialog
                                                          ("Digite um valor "));
        circun = 2*(Math.PI *raio);
        System.out.printf("A circunferÊncia é %.2f \n", circun);
    }
    
}
