package exercise_5_employee.refactor_employee;

public class EmployeeRefactor {
    private String name;
    private double salary;

    public EmployeeRefactor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
