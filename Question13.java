abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

interface Taxable {
    double calculateTax();
}

class PermanentEmployee extends Employee implements Taxable {
    PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is a permanent employee.");
    }

    public double calculateTax() {
        return salary * 0.10;
    }
}

class ContractEmployee extends Employee implements Taxable {
    ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is a contract employee.");
    }

    public double calculateTax() {
        return salary * 0.05;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is an intern.");
    }
}

public class Question13 {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Rahul", 60000);
        Employee e2 = new ContractEmployee("Aman", 40000);
        Employee e3 = new Intern("Riya", 15000);

        e1.work();
        e1.displaySalary();
        System.out.println("Tax: " + ((Taxable)e1).calculateTax());
        System.out.println();

        e2.work();
        e2.displaySalary();
        System.out.println("Tax: " + ((Taxable)e2).calculateTax());
        System.out.println();

        e3.work();
        e3.displaySalary();
    }
}