
class Employee {
    String name;
    int id;
    double salary;

    
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    double bonus;

    
    Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);   
        this.bonus = bonus;
    }
    double calculateTotalSalary() {
        return salary + bonus;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();  // Calling parent method
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}


public class EmployeeSystem {
    public static void main(String[] args) {

    
        Manager m1 = new Manager("Rajesh", 101, 50000, 10000);
        m1.displayManagerDetails();
    }
}
