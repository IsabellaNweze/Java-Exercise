import javax.swing.*;

public class Inches {
    public static void main(String[] args) {
        double inches = Double.parseDouble(JOptionPane.showInputDialog("Enter inches"));
        double centimeteres = 2.54* inches;
        String Output = String.format(" the value in centimeteres is %.2f", centimeteres);
        JOptionPane.showMessageDialog(null, Output);
        System.exit(1);
    }

}
