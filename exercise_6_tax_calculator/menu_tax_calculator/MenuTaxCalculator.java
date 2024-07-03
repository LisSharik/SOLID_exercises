package exercise_6_tax_calculator.menu_tax_calculator;

import javax.swing.JOptionPane;
import exercise_6_tax_calculator.refactor_tax_calculato.UKTaxStrategy;
import exercise_6_tax_calculator.refactor_tax_calculato.USATaxStrategy;

public class MenuTaxCalculator {

    public static void menuTaxCalculator() {
        USATaxStrategy usaTaxStrategy = new USATaxStrategy();
        UKTaxStrategy ukTaxStrategy = new UKTaxStrategy();
        Boolean flag = true;

        while (flag) {
            String option = JOptionPane.showInputDialog("""
                    TAX CALCULATOR MENU OPTIONS

                    1. Calculate Tax for USA
                    2. Calculate Tax for UK
                    3. Exit
                    """);

            switch (option) {
                case "1":
                    usaTaxStrategy.calculateTax();
                    break;

                case "2":
                     ukTaxStrategy.calculateTax();
                    break;

                case "3":
                    flag = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
                    break;
            }
        }
    }
}
