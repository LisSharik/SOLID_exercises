package exercise_2_payment_methods.refactor_payment_processor;

public class PaymentProcessorRefactor {
    private PaymentMethod paymentMethod;

    public PaymentProcessorRefactor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void processPayment() {
        paymentMethod.processPayment();
    }
}
