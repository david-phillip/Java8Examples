package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static learn.java.functionalInterfaces.PredicateStudentExample.agePredicate;

public class BiFunctionExample {

    static List<Student> studentList = StudentDatabase.getStudentList();
    static Map<String, Float> studentMap = new HashMap<>();

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Float>> biFunction =
            (studentList, agePredicate) -> {
                studentList.forEach((student) -> {
                    if (agePredicate.test(student)) {
                        studentMap.put(student.getName(), student.getGrade());
                    }
                });
                return studentMap;
            };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(studentList, agePredicate));
    }
}
