import javax.swing.JOptionPane;

public class InstallmentCalculation {

  public static void main(String args[]) {
    double installmentValue, purchaseValue, finalValue;
    int installmentNumber, taxing;

    purchaseValue = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da compra"));
    installmentNumber = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de parcelas"));

    switch (installmentNumber) {
      case 2:
        taxing = 3;
        break;
      case 4:
        taxing = 7;
        break;
      case 6:
        taxing = 9;
        break;
      case 8:
        taxing = 12;
        break;
      default:
        taxing = -1;
    }

    if (taxing == -1) {
      JOptionPane.showMessageDialog(null, "Número de parcelas incorreto");
    } else {
      finalValue = purchaseValue + purchaseValue * taxing / 100;
      installmentValue = finalValue / installmentNumber;
      JOptionPane.showMessageDialog(null, "O valor de cada parcela é " + installmentValue);
    }
  }
}