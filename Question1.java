class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    Developer(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void displayDetails() {
        System.out.println("Developer");
        super.displayDetails();
    }
}

class Manager extends Employee {
    Manager(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void displayDetails() {
        System.out.println("Manager");
        super.displayDetails();
    }
}

class Tester extends Employee {
    Tester(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    void displayDetails() {
        System.out.println("Tester");
        super.displayDetails();
    }
}

public class Question1 {
    public static void main(String[] args) {
        Developer d = new Developer("Rahul", 101, 50000);
        Manager m = new Manager("Aman", 102, 70000);
        Tester t = new Tester("Riya", 103, 45000);

        d.displayDetails();
        System.out.println();

        m.displayDetails();
        System.out.println();

        t.displayDetails();
    }
}