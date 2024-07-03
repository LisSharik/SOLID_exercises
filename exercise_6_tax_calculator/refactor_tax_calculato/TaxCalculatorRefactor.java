package exercise_6_tax_calculator.refactor_tax_calculato;

public class TaxCalculatorRefactor {
    private TaxStrategy taxStrategy;

    public TaxCalculatorRefactor(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        return taxStrategy.calculateTax();
    }
}
