package exercise_6_tax_calculator.refactor_tax_calculato;

import javax.swing.JOptionPane;

public class USATaxStrategy implements TaxStrategy {

    @Override
    public Double calculateTax() {
        JOptionPane.showMessageDialog(null, "USATaxStrategy calculator");
        return 0.1;
    }
}
