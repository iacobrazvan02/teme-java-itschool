import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amalia", 19, "S1"));
        students.add(new Student("Robert", 20, "S2"));

        sortStudentsByName(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void sortStudentsByName(List<Student> students) {
        Collections.sort(students, Comparator.comparing(student -> student.name));
    }
}
