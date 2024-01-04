package learn.java.streams;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;
import learn.java.functionalInterfaces.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDebugExample {
    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getStudentList();

        Map<String, List<String>> studentMap = new HashMap<>();

        Map<String, List<String>> studentMap2 = studentList.stream()
                .filter(PredicateStudentExample.agePredicate)
                .peek(student -> System.out.println("After 1st filter : " + student))
                .filter(PredicateStudentExample.namePredicate)
                .peek(student2 -> System.out.println("After 2nd filter : " + student2))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap2);
    }
}
