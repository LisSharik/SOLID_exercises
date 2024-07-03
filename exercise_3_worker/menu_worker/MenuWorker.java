package exercise_3_worker.menu_worker;

import javax.swing.JOptionPane;

import exercise_3_worker.refactor_worker.HumanWorkerRefactor;
import exercise_3_worker.refactor_worker.RobotWorkerRefactor;

public class MenuWorker {
    public static void menuWorker() {
        HumanWorkerRefactor humanWorkerRefactor = new HumanWorkerRefactor();
        RobotWorkerRefactor robotWorkerRefactor = new RobotWorkerRefactor();

        Boolean flag = true;

        while (flag) {
            String option = JOptionPane.showInputDialog("""
                       WORKER MENU OPTIONS

                       1. Human Worker
                       2. Robot Worker
                       3. Exit
                    """);

            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, humanWorkerRefactor.eat() + "\n" + humanWorkerRefactor.work());
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, robotWorkerRefactor.work());
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
