import javax.swing.*;

public class celsius {
    public static void main(String[] args) {
        double farenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter your temperature in farenheit"));
        double celsius = 5.0/9.0 *(farenheit-32);
        String output = String.format(" the temperature in celsius is %.2f", celsius);
        JOptionPane.showMessageDialog(null, output);
        System.exit(1);

    }
}
