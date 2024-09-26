import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;
    String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "'}";
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amalia", 19, "S1"));
        students.add(new Student("Robert", 20, "S2"));

        Student found = findStudentById(students, "S2");
        System.out.println(found != null ? found : "Student not found");
    }

    public static Student findStudentById(List<Student> students, String studentId) {
        for (Student student : students) {
            if (student.studentId.equals(studentId)) {
                return student;
            }
        }
        return null;
    }
}
