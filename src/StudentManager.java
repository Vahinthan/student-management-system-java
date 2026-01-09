import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        students.add(new Student(id, name, age));
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nStudent List:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
