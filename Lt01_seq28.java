/*Objetivo: Receba o preço atual e a média mensal de um produto.
Calcule e mostre o
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
Programadora: Débora Oliveira
Data: 20/08/2018
 */
import javax.swing.JOptionPane;
public class Lt01_seq28 {
    public static void main(String args[]){
        double precoA,mediames, newpreco;
        precoA = Double.parseDouble(JOptionPane.showInputDialog
                                            ("Digite preço atual do produto"));
        mediames = Double.parseDouble(JOptionPane.showInputDialog
                                ("Digite média mensal de vendas do produto"));
        if (mediames <500 && precoA<30){
            newpreco = precoA+(precoA*0.10);
            System.out.println("Novo preço do produto "+ newpreco);
        }else{
            if (mediames>=500 && mediames<1000 && precoA>=30 && precoA <80){
                newpreco = precoA+(precoA*0.15);
                System.out.println("Novo preço do produto "+ newpreco);
            }else{
                if(mediames>=1000 && precoA>=80){
                    newpreco = precoA+(precoA*0.05);
                    System.out.println("Novo preço do produto "+ newpreco);
                }else{
                    newpreco = precoA;
                    System.out.println("Novo preço do produto "+ newpreco);
                }
            }
        }
    }
    
}
