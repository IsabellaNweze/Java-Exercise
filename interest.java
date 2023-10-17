import javax.swing.*;

public class interest {
    public static void main(String[] args) {
        double bal = Double.parseDouble(JOptionPane.showInputDialog("Enter an acct balance "));
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter an interest rate"));
         double percent = rate/100;
         double interest = (bal*percent*1)/100;

         double new_balance = interest + bal;
         String output = String.format("The new balance is %.2f", new_balance);
         JOptionPane.showMessageDialog(null, output);

         System.exit(1);

    }
}
