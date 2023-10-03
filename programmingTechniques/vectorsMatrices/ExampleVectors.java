import javax.swing.JOptionPane;

public class ExampleVectors {

  public static void main(String args[]) {
    float[] salary = new float[5];

    for (int i = 0; i < 5; i++) {
      salary[i] =
        Float.parseFloat(JOptionPane.showInputDialog("Insira o salário"));
    }

		// salary[4] = 15.52f;
		// salary[0] = 1100.15f;
		// salary[1] = 650.15f
		// salary[2] = 150.15f;
		// salary[3] = 11.05f;

    for (int i = 0; i < 5; i++) {
      JOptionPane.showMessageDialog(
        null,
        "Funcionário: " + (i + 1) + "Salário: " + salary[i]
      );
    }
  }
}
