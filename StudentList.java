
package asignment9;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
    ArrayList<Student> students = new ArrayList<>();
     public void addStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter info for student " + (i + 1) + ":");
            Student s = new Student();
            s.enterStudentInfo();
            students.add(s);
        }
    }

    public void displayAllStudents() {
        for (Student s : students) s.displayStudentInfo();
    }

    public Student findStudent(String id) {
        for (Student s : students) 
            if (s.getStudentId().equals(id)) return s;
        return null;
    }

    public boolean deleteStudent(String id) {
        Student s = findStudent(id);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }

    public boolean editStudent(String id) {
        Student s = findStudent(id);
        if (s != null) {
            System.out.println("Enter new info for the student:");
            s.enterStudentInfo();
            return true;
        }
        return false;
    }
}
