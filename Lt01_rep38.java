/*Objetivo      : Receba 100 números reais. Verifique e mostre o maior e menor 
                   valor. Obs.: somente valores positivos.
                   Este código fonte será salvo no arquivo
                   Lt01_res38.java
Programadora    : Débora Oliveira
Data            :16/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_rep38 {
    public static void main(String args[]){
        double num, cont, maior, menor;
        num = Double.parseDouble(JOptionPane.showInputDialog
                                                           ("Digite um valor"));
        maior=num;
        menor=num;
        for (cont=1;cont<=99;cont++){
            num = Double.parseDouble(JOptionPane.showInputDialog
                                                           ("Digite um valor"));
            if (num>=0){
                //verificar se é maior ou menor 
                if (num>maior){
                    maior=num;
                }else{
                    if(num<menor){
                        menor=num;
                    }
                }

            }

        }
        System.out.printf("Maior número digitado foi %.2f \n" , maior);
        System.out.printf("Menor número digitado foi %.2f \n" , menor);
    }
    
}
