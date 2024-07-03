import javax.swing.JOptionPane;

import exercise_1_order.menu_order.MenuOrder;
import exercise_2_payment_methods.menu_payment_methods.MenuPaymentMethod;
import exercise_3_worker.menu_worker.MenuWorker;
import exercise_4_database.menu_database.MenuDataBase;
import exercise_5_employee.menu_employee.MenuEmployee;
import exercise_6_tax_calculator.menu_tax_calculator.MenuTaxCalculator;

public class Main {
    public static void main(String[] args) {
        Boolean flag = true;

        while (flag) {
            String option = JOptionPane.showInputDialog("""
                        MENU OPTIONS

                        1. Exercise 1: Order
                        2. Exercise 2: Payment Methods
                        3. Exercise 3: Worker
                        4. Exercise 4: Database
                        5. Exercise 5: Employee
                        6. Exercise 6: Tax calculator
                        7. Exit
                    """);

            switch (option) {
                case "1":
                    MenuOrder.menuOrder();
                    break;

                case "2":
                    MenuPaymentMethod.menuPaymentMethod();
                    break;

                case "3":
                    MenuWorker.menuWorker();
                    break;

                case "4":
                    MenuDataBase.menuDataBase();
                    break;

                case "5":
                    MenuEmployee.menuEMployee();
                    break;

                case "6":
                    MenuTaxCalculator.menuTaxCalculator();
                    break;

                case "7":
                    flag = false;
                    break;
                default:
                    break;
            }
        }

    }

}