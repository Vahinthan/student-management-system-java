import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                manager.addStudent(scanner);
            }
            else if (choice == 2) {
                manager.viewStudents();
            }
            else if (choice == 3) {
                manager.deleteStudent(scanner);
            }
            else if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
