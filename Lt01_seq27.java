/*Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o 
tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
Programadora: Débora Oliveira
Data: 20/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq27 {
    public static void main(String args[]){
      double nvoltas, extensao,tempo,vm;
        nvoltas = Double.parseDouble(JOptionPane.showInputDialog
                                                   ("Digite número de voltas"));
        extensao = Double.parseDouble(JOptionPane.showInputDialog
                                     ("Digite extensão do circuito em metros"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog
                                                ("Digite tempo em minutos"));
        vm =((nvoltas*extensao)/tempo)*3.6;
        System.out.println("A velocidade média em km/h é " + vm);
    }
}
