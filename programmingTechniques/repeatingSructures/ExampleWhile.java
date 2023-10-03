import javax.swing.JOptionPane;

public class ExampleWhile {

  public static void main(String args[]) {
    double average, sum = 0;
    int number, amount = 0;
    char response = 's';

    while (response == 's' || response == 'S') {
      number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
      sum = sum + number;
      amount = amount + 1;

      response = JOptionPane.showInputDialog("Deseja continuar ?").charAt(0);
    }

    average = sum / amount;

    JOptionPane.showMessageDialog(null, "A média dos números digitado é: " + average);
  }
}