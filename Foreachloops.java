// Employee class
class Employee {
    // Instance variables
    int empId;
    private double salary;
    public String name;

    // Constructor
    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

// Main class
public class Foreachloops {
    public static void main(String[] args) {
        // Step 1: Declare an array of Employee objects
        Employee[] employees = new Employee[3];  // Array of size 3

        // Step 2: Create and assign Employee objects to array indices
        employees[0] = new Employee("Rahul", 101, 50000);
        employees[1] = new Employee("Anjali", 102, 60000);
        employees[2] = new Employee("Vikram", 103, 55000);

        // Step 3: Using a foreach loop to display employee details
        for (Employee emp : employees) {
            System.out.println(emp.name + " : " + emp.empId);
        }
    }
}
