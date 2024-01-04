package learn.java.methodReferences;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;
import learn.java.functionalInterfaces.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import static learn.java.functionalInterfaces.PredicateStudentExample.agePredicate;

public class MethodReferenceExample {
    static List<Student> studentList = StudentDatabase.getStudentList();
    static Map<String, Integer> studentMap = new HashMap<>();
    static Function<Predicate<Student>,  Map<String, Integer>> studentFunction =
            (agePredicate) -> {
                studentList.forEach(student -> {
                    if(agePredicate.test(student)){
                        studentMap.put(student.getName(), student.getAge());
                    }
                });

                return studentMap;
            };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(agePredicate));
    }
}
