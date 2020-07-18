import javax.swing.JOptionPane;
public class TesteRecursiva {
    public static void main(String[] args){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, FunctionRecursiva(num));
    }
    static int FunctionRecursiva(int n){
        int x=1,cta;
        for(cta=n; cta>=1;cta--){
            x=x*cta;
        }
        return x;
    }
}
