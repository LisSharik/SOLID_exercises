package exercise_4_database.menu_database;

import javax.swing.JOptionPane;

import exercise_4_database.refactor_database.DataServiceRefactor;
import exercise_4_database.refactor_database.DataStorage;
import exercise_4_database.refactor_database.DatabaseRefactor;

public class MenuDataBase {
    public static void menuDataBase() {
        DataStorage dataStorage = new DatabaseRefactor();
        DataServiceRefactor dataServiceRefactor = new DataServiceRefactor(dataStorage);

        Boolean flag = true;

        while (flag) {
            String option = JOptionPane.showInputDialog("""
                    DATABASE MENU OPTIONS

                    1. DataBase
                    2. Exit
                    """);

            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, dataServiceRefactor.saveData("Item"));

                    break;

                case "2":
                    flag = false;
                    break;


                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
                    break;
            }

        }

    }
}
