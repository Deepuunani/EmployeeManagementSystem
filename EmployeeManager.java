import java.util.ArrayList;

public class EmployeeManager {

    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void viewEmployees() {
        for (Employee emp : employees) {
            emp.display();
        }
    }

    public void searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.display();
                return;
            }
        }
        System.out.println("Employee not found");
    }

    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee deleted");
    }
}
