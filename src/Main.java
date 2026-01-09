import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();

                scanner.nextLine(); // clear buffer

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = scanner.nextInt();

                students.add(new Student(id, name, age));
                System.out.println("Student added successfully!");

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("\nStudent List:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
