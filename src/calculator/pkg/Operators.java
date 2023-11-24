package calculator.pkg;

import javax.swing.*;
import java.util.Scanner;

public class Operators {
    Double aNumber;
    Double bNumber;
    double result;

    public Operators() {
        aNumber = 0.0;
        bNumber = 0.0;
        result = 0;
    }

    public void addition () {
       aNumber = Double.parseDouble(JOptionPane.showInputDialog("Select first value"));
       bNumber = Double.parseDouble(JOptionPane.showInputDialog("Select second value"));
       result = aNumber + bNumber;
       JOptionPane.showMessageDialog(null, "The result is " + result);
    }

    public void subtraction () {
        aNumber = Double.parseDouble(JOptionPane.showInputDialog("Select first value"));
        bNumber = Double.parseDouble(JOptionPane.showInputDialog("Select second value"));
        result = aNumber - bNumber;
        JOptionPane.showMessageDialog(null, "The result is " + result);
    }

    public void division () {
        aNumber = Double.parseDouble(JOptionPane.showInputDialog("Select first value"));
        bNumber = Double.parseDouble(JOptionPane.showInputDialog("Select second value"));
        result = aNumber / bNumber;
        JOptionPane.showMessageDialog(null, "The result is " + result);
    }

    public void multiplication () {
        aNumber = Double.parseDouble(JOptionPane.showInputDialog("Select first value"));
        bNumber = Double.parseDouble(JOptionPane.showInputDialog("Select second value"));
        result = aNumber * bNumber;
        JOptionPane.showMessageDialog(null, "The result is " + result);
    }
}
