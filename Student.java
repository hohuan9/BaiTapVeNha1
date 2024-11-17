
package asignment9;
import java.util.Scanner;
public class Student {
    String studentId, fullName, dateOfBirth, major;
    float gpa;
    public void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: "); studentId = sc.nextLine();
        System.out.print("Enter Name: "); fullName = sc.nextLine();
        System.out.print("Enter DOB: "); dateOfBirth = sc.nextLine();
        System.out.print("Enter Major: "); major = sc.nextLine();
        System.out.print("Enter GPA: "); gpa = sc.nextFloat();
    }

    public void displayStudentInfo() {
        System.out.printf("ID: %s, Name: %s, DOB: %s, Major: %s, GPA: %.2f%n",
                studentId, fullName, dateOfBirth, major, gpa);
    }

    public String getStudentId() {
        return studentId;
    }
}
