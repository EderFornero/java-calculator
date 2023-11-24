package calculator.pkg;

import javax.swing.*;

public class Main {

    static int options;
    static String menu;
    public static void main (String[] args) {
        Operators object = new Operators();

        do{
            menu = JOptionPane.showInputDialog("Menu\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Division\n" + "4. Multiplication\n" + "5. Exit");
            options = Integer.parseInt(menu);
            switch (options){
                case 1:
                    object.addition();
                    break;
                case 2:
                    object.subtraction();
                    break;
                case 3:
                    object.division();
                    break;
                case 4:
                    object.multiplication();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option " + options + " incorrect");
            }
        }while(options != 5);
    }
}