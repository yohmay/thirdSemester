import javax.swing.JOptionPane;

public class SumNumbers {

  public static void main(String args[]) {
    double sum = 0;
    double number;
    int i;

    for (i = 1; i <= 10; i++) {
      number = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
      sum = sum + number;
    }

    JOptionPane.showMessageDialog(null, "A somatória é " + sum);
  }
}