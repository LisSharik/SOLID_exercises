package exercise_1_order.menu_order;

import java.util.Arrays;

import javax.swing.JOptionPane;

import exercise_1_order.refactor_oder.OrderDataBase;
import exercise_1_order.refactor_oder.OrderPrinter;
import exercise_1_order.refactor_oder.OrderRefactor;

public class MenuOrder {
        

    public static void menuOrder() {
            OrderRefactor order = new OrderRefactor(Arrays.asList("item1", "item2", "item3"));
            OrderPrinter printer = new OrderPrinter();
            OrderDataBase database = new OrderDataBase();

            PrintOrderOption printOrderOption = new PrintOrderOption(printer, order);

            SaveOrderOption saveOrderOption = new SaveOrderOption(database, order);

        Boolean flag = true;
            while (flag) {
                String option = JOptionPane.showInputDialog("""
                        ORDER MENU OPTIONS

                        1. Order Printer
                        2. Order DataBase
                        3. Exit
                        """);

                switch (option) {
                    case "1":
                        printOrderOption.execute();
                        
                        break;

                    case "2":
                        saveOrderOption.execute();
                        break;
                    
                    case "3":
                        flag = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,  "Invalid option");
                        break;
                }

            }
        }



        
}
