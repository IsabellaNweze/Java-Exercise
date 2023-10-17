import javax.swing.*;

public class Average {
    public static void main(String[] args) {


        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a double precision number :"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another double precision number"));
        double Average = (num1 + num2) / 2;
        String Output = String.format(" the average of the two numbers is %.2f", Average);
        JOptionPane.showMessageDialog(null, Output);
        System.exit(1);
    }

}
