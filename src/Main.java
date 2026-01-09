import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create ArrayList to store students
        ArrayList<Student> students = new ArrayList<>();

        // Add students
        students.add(new Student(1, "Kamal", 20));
        students.add(new Student(2, "Nimal", 21));
        students.add(new Student(3, "Saman", 22));

        // Display all students
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
