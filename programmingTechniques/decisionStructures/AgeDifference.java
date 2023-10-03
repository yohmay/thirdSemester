import javax.swing.JOptionPane;

public class AgeDifference {

  public static void main(String args[]) {
    int age;
    age = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

    if (age >= 18) {
      JOptionPane.showMessageDialog(null, "Maior de idade");
    } else {
      JOptionPane.showMessageDialog(null, "Menor de idade");
    }
  }
}