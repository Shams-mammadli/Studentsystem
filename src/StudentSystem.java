import java.util.ArrayList;
import java.util.List;
public class StudentSystem {
    private final List <Student> students = new ArrayList <>();
    private int count;
    public void addStudent ( Student student ) {
        students.add(student);
    }
    public void updateStudent ( String name, int registrationNumber, int age ) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getRegistrationNumber() == registrationNumber) {
                count++;
                student.setName(name);
                student.setAge(age);
            }
        }
        if (count == 0) {
            throw new StudentNotFound("Student not found");
        }
    }
    public void displayDetails () {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
