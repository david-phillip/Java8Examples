package learn.java.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getStudentList() {

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Adam", 10, Arrays.asList("Playing", "Music"), 3.0F);
        Student s2 = new Student("Bob", 12, Arrays.asList("Studying", "Art"), 3.5F);
        Student s3 = new Student("Carry", 15, Arrays.asList("Reading", "Drawing"), 2.5F);
        Student s4 = new Student("Darren", 15, Arrays.asList("Reading", "Drawing"), 4.0F);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        return studentList;
    }
}
