import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number : "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another number : "));

            double sum = num1+num2;
            double subtract = num1-num2;
            double Multiply = num1*num2;
            double divide = num1/num2;

            JOptionPane.showMessageDialog(null, " The sum is"+ sum);
            JOptionPane.showMessageDialog(null, " The result of subtraction  is"+ subtract);
            JOptionPane.showMessageDialog(null, " The result of multiplication  is"+ Multiply);
            JOptionPane.showMessageDialog(null, " The result of the division  is"+ divide);

            System.exit(1);






    }
    }
