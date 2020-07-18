/*Objetivo      : Receba o salário de um funcionário e 
                  mostre o novo salário com reajuste de 15%.
                  Este código fonte será salvo no arquivo
                  Lt01_seq02.java
Programadora    : Débora Oliveira
Data            :02/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_seq02 {
    public static void main (String args[]){
        double salario, reajuste;
        salario = Double.parseDouble(JOptionPane.showInputDialog ("Digite o salário : "));
        reajuste = salario+(salario*0.15);
        System.out.println("Salário com reajuste de 15% será de " + reajuste);
    }
}
