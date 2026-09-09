class Student {
    static String universityName = "ABC University";
    static int studentCount = 0;

    int studentId;
    String name;
    String course;

    Student(String name, String course) {
        studentCount++;
        studentId = studentCount;
        this.name = name;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println();
    }

    static void showStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", "CSE");
        Student s2 = new Student("Aman", "ECE");
        Student s3 = new Student("Riya", "CSE");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.showStudentCount();
    }
}