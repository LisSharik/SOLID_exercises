package exercise_2_payment_methods.menu_payment_methods;

import javax.swing.JOptionPane;

import exercise_2_payment_methods.refactor_payment_processor.CreditCardPayment;
import exercise_2_payment_methods.refactor_payment_processor.PayPalPayment;

public class MenuPaymentMethod {

    public static void menuPaymentMethod() {
        PayPalPayment payPalPayment = new PayPalPayment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();

        PaymentMethodOption paymentMethodCredit = new PaymentMethodOption(creditCardPayment);

        PaymentMethodOption paymentMethodPayPal = new PaymentMethodOption(payPalPayment);

        Boolean flag = true;

        while (flag) {
            String option = JOptionPane.showInputDialog("""
                       PAYMENT METHODS MENU OPTIONS

                       1. Paypal Method
                       2. Credit Card Method
                       3. Exit
                    """);

            switch (option) {
                case "1":

                    paymentMethodPayPal.execute();

                    break;

                case "2":
                    paymentMethodCredit.execute();
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
