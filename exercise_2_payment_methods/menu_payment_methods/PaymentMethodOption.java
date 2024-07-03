package exercise_2_payment_methods.menu_payment_methods;

import javax.swing.JOptionPane;

import exercise_2_payment_methods.refactor_payment_processor.PaymentMethod;
import menu.MenuOption;

public class PaymentMethodOption implements MenuOption{
    private PaymentMethod paymentMethod;

    public PaymentMethodOption(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    } 

    @Override
    public void execute() {
        JOptionPane.showMessageDialog(null, paymentMethod.processPayment());
    }
    
}
