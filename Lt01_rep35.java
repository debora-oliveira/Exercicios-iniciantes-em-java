/*Objetivo      : Receba 2 números inteiros, verifique qual o maior entre eles.
                  Calcule e mostre o resultado da somatória dos números
                   ímpares entre esses valores.
                   Este código fonte será salvo no arquivo
                   Lt01_rep35.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep35 {
    public static void main (String args[]){
        int num1 , num2, cont, res, somaimpar=0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog
                                                        ("Digite um número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog
                                                          ("Digite um número"));
        if (num1>num2){
            for (cont=num2; cont<=num1; cont++){
               res = cont%2;
               if (res!=0){
                   somaimpar = somaimpar+cont;
               }
            }
            System.out.println("A soma dos ímpares é " + somaimpar);
        }else{
            if(num2>num1){
                for(cont=num1; cont<=num2;cont++){
                    res=cont%2;
                    if (res!=0){
                        somaimpar += cont;
                    }
                }
                System.out.println("A soma dos ímpares é " + somaimpar);
            }
        }
            
    } 
}
