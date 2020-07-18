import javax.swing.JOptionPane;
public class Recursiva01 {
    public static void main(String[] args){
    int n;
    n=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    JOptionPane.showMessageDialog(null, Recursiva01(n) );
    }
    static int Recursiva01(int num){
        int x;
        if (num==1){
            return 1;
        }else{
            x=num*Recursiva01(num-1);
            return x;
        }
    }
}
