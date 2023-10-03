import javax.swing.JOptionPane;

public class ExampleDoWhile {

	public static void main(String args[]) {
		int number, sum = 0;

		do {
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

			if (number % 2 != 0) {
				sum = sum + number;
			}
		} while (number != 0);

		JOptionPane.showMessageDialog(null, "A soma dos números ímpares é: " + sum);
	}
}