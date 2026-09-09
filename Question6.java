class Employee {
    final int RETIREMENT_AGE = 60;

    void checkRetirementAge(int employeeAge) {
        if (employeeAge >= RETIREMENT_AGE) {
            System.out.println("Employee is eligible for retirement.");
        } else {
            System.out.println("Employee is not eligible for retirement.");
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.checkRetirementAge(65);
        e.checkRetirementAge(45);
    }
}