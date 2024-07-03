package exercise_1_order.refactor_oder;

import java.util.List;

public class OrderRefactor {
    private List<String> items;
    private double totalAmount;

    public OrderRefactor(List<String> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    private double calculateTotal() {
        // Lógica para calcular el total de la orden
        return 100.0; // simplificado
    }
}
