class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("I am a person.");
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayRole() {
        System.out.println("Doctor: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person {
    String department;

    Nurse(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Nurse: " + name);
        System.out.println("Department: " + department);
    }
}

class Patient extends Person {
    String disease;

    Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    void displayRole() {
        System.out.println("Patient: " + name);
        System.out.println("Disease: " + disease);
    }
}

public class Question11 {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sharma", 45, "Cardiology");
        Nurse n = new Nurse("Neha", 30, "Emergency");
        Patient p = new Patient("Aman", 25, "Fever");

        d.displayRole();
        System.out.println();

        n.displayRole();
        System.out.println();

        p.displayRole();
    }
}