/*Objetivo      : Receba os valores do comprimento,
                  largura e altura de um paralelepípedo.
                  Calcule e mostre seu volume.
                  Este código fonte será salvo no arquivo
                  Lt01_seq07.java
Programadora    : Débora Oliveira
Data            :07/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq07 {
    public static void main (String args[]){
        double comp,larg, alt,vol;
        comp = Double.parseDouble(JOptionPane.showInputDialog
                                    ("Digite comprimento do paralelepípedo: "));
        larg = Double.parseDouble(JOptionPane.showInputDialog
                                        ("Digite largura do paralelepípedo: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog
                                         ("Digite altura do paralelepípedo: "));
        vol = comp*alt*larg;
        System.out.printf("O volume do paralelepípedo é %.2f \n", vol);
    }
    
}
