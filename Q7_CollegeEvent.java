import java.util.HashSet;

class CollegeEvent {
    public static void main(String[] args) {
        HashSet<String> registeredStudents = new HashSet<>();

        registeredStudents.add("Alice");
        registeredStudents.add("Bob");
        registeredStudents.add("Charlie");
        registeredStudents.add("David");

        System.out.println("Total registered students: " + registeredStudents.size());

        registeredStudents.remove("Bob");

        System.out.println("After removal:");
        for (String student : registeredStudents) {
            System.out.println(student);
        }
    }
}