/*Objetivo      : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99.
                   Este código fonte será salvo no arquivo
                   Lt01_rep44.java
Programadora    : Débora Oliveira
Data            :21/08/2018
 */
public class Lt01_rep42 {
    public static void main(String[] args){
        double num1=1,num2=1,serie;
        while(num1<=50 && num2<=99){
            serie = num1/num2;
            System.out.printf(num1 + " / " + num2 + " = " + "%.4f\n",serie);
            num1++;
            num2=num2+2;
        }
    }
    
}
