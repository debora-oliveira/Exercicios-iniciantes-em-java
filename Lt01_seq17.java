/*Objetivo      : Calcule a quantidade de litros gastos em uma viagem,
                  sabendo que o automóvel faz 12 km/l.
                  Receber o tempo de percurso e a velocidade média.
                  Este código fonte será salvo no arquivo
                  Lt01_seq17.java
Programadora    : Débora Oliveira
Data            :08/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq17 {
    public static void main(String args[]){
        int vm,t,s;
        vm = Integer.parseInt(JOptionPane.showInputDialog
                                                   ("Digite velocidade média"));
        t = Integer.parseInt(JOptionPane.showInputDialog
                                                  ("Digite tempo de percurso"));
        s = vm*t;
        double qtdlitros =(double) s/12;
        System.out.printf("A quantidade de litros gasto foi de %.2f \n", qtdlitros);
    }
    
}
