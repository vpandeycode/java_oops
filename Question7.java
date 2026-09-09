class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    final double calculateAnnualSalary() {
        return salary * 12;
    }
}

class Developer extends Employee {
    Developer(double salary) {
        super(salary);
    }
}

class Manager extends Employee {
    Manager(double salary) {
        super(salary);
    }
}

class Tester extends Employee {
    Tester(double salary) {
        super(salary);
    }
}

public class Question7 {
    public static void main(String[] args) {
        Developer d = new Developer(50000);
        Manager m = new Manager(70000);
        Tester t = new Tester(45000);

        System.out.println("Developer annual salary: " + d.calculateAnnualSalary());
        System.out.println("Manager annual salary: " + m.calculateAnnualSalary());
        System.out.println("Tester annual salary: " + t.calculateAnnualSalary());

        // calculateAnnualSalary() cannot be overridden because it is final.
    }
}