/*Objetivo      :Calcule e mostre o quadrado dos números entre 10 e 150.
Programadora    : Débora Oliveira
Data            :24/08/2018
 */
public class Lt01_rep31 {
    public static void main(String args[]){
        int num = 10,quadrado;
        while (num<=150){
            quadrado = num*num;
            System.out.println("O quadrado de " + num + " é " + quadrado);
            num++;
        }
    }
    
}
