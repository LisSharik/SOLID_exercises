package exercise_1_order.refactor_oder;


public class OrderPrinter {
    public String printOrder(OrderRefactor order) {
        String message = "Order details: \n";
        for(String item: order.getItems()){
            message += " - " + item + "\n";
        }
        message += "Total mount: " + order.getTotalAmount();
        return message;
    }
}
