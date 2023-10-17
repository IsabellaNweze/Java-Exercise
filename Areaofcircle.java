import javax.swing.*;

import static java.lang.Math.PI;

public class Areaofcircle {
    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog(" Enter the radius of your circle"));
        double Area = PI* radius*radius;
        String output = String.format(" the Area of the circle is %.2f", Area);
        JOptionPane.showMessageDialog(null, output);
        System.exit(1);

    }
}
