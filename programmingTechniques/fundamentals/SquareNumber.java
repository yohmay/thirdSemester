import javax.swing.JOptionPane;

public class SquareNumber {

  public static void main(String[] args) {
    int q, n;

    n = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número"));
    q = n * n;

    JOptionPane.showMessageDialog(null, "O quadrado de " + n + " é " + q);
  }
}
