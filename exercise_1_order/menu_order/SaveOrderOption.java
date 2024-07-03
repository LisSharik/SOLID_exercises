package exercise_1_order.menu_order;

import javax.swing.JOptionPane;

import exercise_1_order.refactor_oder.OrderDataBase;
import exercise_1_order.refactor_oder.OrderRefactor;
import menu.MenuOption;

public class SaveOrderOption implements MenuOption {
    private OrderDataBase database;
      private OrderRefactor order;

      public SaveOrderOption(OrderDataBase database, OrderRefactor order) {
        this.database = database;
        this.order = order;
    }


    @Override
    public void execute() {
        JOptionPane.showMessageDialog(null, database.saveToDatabase(order));
    }
    
}
