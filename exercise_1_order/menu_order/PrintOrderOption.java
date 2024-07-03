package exercise_1_order.menu_order;

import javax.swing.JOptionPane;

import exercise_1_order.refactor_oder.OrderPrinter;
import exercise_1_order.refactor_oder.OrderRefactor;
import menu.MenuOption;

public class PrintOrderOption implements MenuOption{
    private OrderPrinter printer;
    private OrderRefactor order;

    public PrintOrderOption(OrderPrinter printer, OrderRefactor order) {
        this.printer = printer;
        this.order = order;
    }


    @Override
    public void execute() {
        JOptionPane.showMessageDialog(null, printer.printOrder(order));
    
    }
    
}
