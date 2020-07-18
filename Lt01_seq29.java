/*Objetivo:  . Receba o tipo de investimento (1 = poupança e 2 = renda fixa) 
e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias 
sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados.
Programadora:  Débora Oliveira
Data:  12/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq29 {
    public static void main(String args[]){
        // tipo = tipo de investimento
        //valorI = valor investido, valorC = valor corrigido
        int tipo;
        double valorI, valorC;
        tipo = Integer.parseInt(JOptionPane.showInputDialog
                               ("Digite 1 para poupança ou 2 para renda fixa"));
        valorI = Double.parseDouble(JOptionPane.showInputDialog
                                              ("Digite valor do investimento"));
        if (tipo ==1 ){
            valorC = valorI+(valorI*0.03);
            System.out.println("Valor investido após 30 dias é de "+ valorC);
        }else{
            if (tipo ==2 ){
                valorC = valorI+(valorI*0.05);
                System.out.println
                              ("Valor investido após 30 dias será de "+ valorC);
            }
        }
    }
    
}
