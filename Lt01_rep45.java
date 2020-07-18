/*Objetivo  :Calcule e mostre a série 
                1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
              Este código fonte será salvo no arquivo
              Lt01_rep45.java
Programadora  : Débora Oliveira
Data          :21/08/2018
 */
public class Lt01_rep45 {
    public static void main(String[] args){
        double num1=1, num2=1, serie1=0,serie2=0,serie=0;
        do{
            if (num1%2!=0){
                serie1=num1/num2;
                System.out.println(serie1);
            }
            else{
                if(num1%2==0){
                    serie2=num1/num2;
                    System.out.println(serie2);
                }
            }
            serie=serie+serie1-(serie2);
            //System.out.println(serie + " = "+serie+" + "+serie1+" - "+serie2);
            num1++;
            num2=num1*num1;
        }while(num1<16 && num2<226);
    }
    
}
