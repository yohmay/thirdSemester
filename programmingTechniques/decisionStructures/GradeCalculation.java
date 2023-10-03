import javax.swing.JOptionPane;

public class GradeCalculation {

  public static void main(String args[]) {
    Double firstNote, secondNote, average;

    firstNote = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira Nota"));
    secondNote = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda Nota"));

    average = (firstNote - secondNote) / 2;

    if (average >= 6.0) {
      JOptionPane.showMessageDialog(null, "Aprovado");
    } else {
      if (average >= 3.0) {
        JOptionPane.showMessageDialog(null, "Recuperação");
      } else {
        JOptionPane.showMessageDialog(null, "Reprovado");
      }
    }
  }
}