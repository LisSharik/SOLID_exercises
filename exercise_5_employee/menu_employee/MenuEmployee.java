package exercise_5_employee.menu_employee;

import javax.swing.JOptionPane;

import exercise_5_employee.refactor_employee.EmployeeReport;
import exercise_5_employee.refactor_employee.EmployeeRepository;
import exercise_5_employee.refactor_employee.PayrollService;

public class MenuEmployee {
    public static void menuEMployee() {
        PayrollService payrollService = new PayrollService();
        EmployeeReport employeeReport = new EmployeeReport();
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Boolean flag = true;

        while (flag) {
            String option = JOptionPane.showInputDialog("""
                    EMPLOYEE MENU OPTIONS

                    1. Payoll
                    2. Report
                    3. Repository
                    4. Exit
                    """);

            switch (option) {
                case "1":
                    payrollService.calculatePay();
                    break;

                case "2":
                    employeeReport.generateReport();
                    break;

                case "3":
                    employeeRepository.saveToDatabase();
                    break;

                case "4":
                    flag = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
                    break;
            }

        }

    }

}
