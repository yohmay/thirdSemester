import javax.swing.JOptionPane;

public class PairNumber {

  public static void main(String args[]) {
    int number;

    number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

    if (number % 2 == 0) {
      JOptionPane.showMessageDialog(null, "O número: " + number + "é par");
    }
  }
}