/*Objetivo      : Receba a quantidade de horas trabalhadas, o valor por hora,
o percentual de desconto e o número de descendentes. Calcule o salário que serão 
as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber.
                  Este código fonte será salvo no arquivo
                  Lt01_seq16.java
Programadora    : Débora Oliveira
Data            :08/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq16 {
    public static void main (String args[]){
        double horatrab, valorhora, pdesc, salb, sal, dep;
        horatrab = Double.parseDouble(JOptionPane.showInputDialog
                                                  ("Digite horas trabalhadas"));
        valorhora = Double.parseDouble(JOptionPane.showInputDialog
                                           ("Digite valor da hora trabalhada"));
        pdesc = Double.parseDouble(JOptionPane.showInputDialog
                                             ("Digite percentual de desconto"));
        dep = Double.parseDouble(JOptionPane.showInputDialog
                                             ("Digite número de descendentes"));
        salb = horatrab * valorhora;
        sal = (salb-(pdesc/100)*salb)+dep*100;
        System.out.printf("O salário líquido será de %.2f \n", sal);
    }
    
}
