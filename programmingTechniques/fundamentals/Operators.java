import javax.swing.JOptionPane;

public class Operators {

  public static void main(String[] args) {
    int firstNumber, secondNumber;

    firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));

    secondNumber = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o segundo número "));

    JOptionPane.showMessageDialog(
        null,
        "Soma: " + (firstNumber + secondNumber));

    JOptionPane.showMessageDialog(
        null,
        "Subtração: " + (firstNumber - secondNumber));

    JOptionPane.showMessageDialog(
        null,
        "Multiplicação: " + (firstNumber * secondNumber));

    JOptionPane.showMessageDialog(
        null,
        "Divisão: " + (firstNumber / secondNumber));

    JOptionPane.showMessageDialog(
        null,
        "Resto: " + (firstNumber % secondNumber));
  }
}
