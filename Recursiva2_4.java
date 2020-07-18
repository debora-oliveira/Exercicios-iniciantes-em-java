/*Objetivo: n!+(n-1)!+(n-2)!+...+1!
Programadora: Débora Oliveira
Data:06/09/2018
*/
import javax.swing.JOptionPane;
public class Recursiva2_4 {
    public static void main(String[] args){
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null,Recursiva2_4(num));
    }
    static int Recursiva2_4(int n){
        if(n==1){
            return 1;
        }else{
            return FunctionFat(n)+Recursiva2_4(n-1);
        }
    }
    static int FunctionFat(int nume){
        int cont,fat=1;
        for (cont=nume; cont>=1; cont--){
            fat =fat*cont;
        }
         return fat;
    }
    
}

