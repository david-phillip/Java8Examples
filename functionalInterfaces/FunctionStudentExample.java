package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static learn.java.functionalInterfaces.PredicateStudentExample.agePredicate;

public class FunctionStudentExample {

    static List<Student> studentList = StudentDatabase.getStudentList();
    static Map<String, Float> studentMap = new HashMap<>();

    static Function<List<Student>, Map<String, Float>> createStudentMap = (students) ->
            {students.forEach(student ->
                {
                    studentMap.put(student.getName(), student.getGrade());
                });
            return studentMap;
    };

    public static void main(String[] args) {

        createStudentMap.apply(studentList);

        System.out.println(studentMap);
    }
}
