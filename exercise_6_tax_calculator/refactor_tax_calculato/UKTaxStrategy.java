package exercise_6_tax_calculator.refactor_tax_calculato;

import javax.swing.JOptionPane;

public class UKTaxStrategy implements TaxStrategy {

    @Override
    public Double calculateTax() {
        JOptionPane.showMessageDialog(null, "UKTaxStrategy calculator");
        return 0.2;
    }
}
