
package asignment9;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Students");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Edit Student by ID");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: list.addStudents(); break;
                case 2: list.displayAllStudents(); break;
                case 3:
                    System.out.print("Enter ID to find: ");
                    String id = sc.nextLine();
                    Student s = list.findStudent(id);
                    if (s != null) s.displayStudentInfo();
                    else System.out.println("Student not found.");
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    if (list.deleteStudent(sc.nextLine())) 
                        System.out.println("Deleted.");
                    else System.out.println("Not found.");
                    break;
                case 5:
                    System.out.print("Enter ID to edit: ");
                    if (list.editStudent(sc.nextLine())) 
                        System.out.println("Updated.");
                    else System.out.println("Not found.");
                    break;
                case 6: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
