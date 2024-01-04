package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> studentList = StudentDatabase.getStudentList();
    public static Predicate<Student> agePredicate = (s) -> s.getAge() == 15;
    public static Predicate<Student> namePredicate = (s) -> s.getName().startsWith("D");

    public static void filterStudentByNameAndAge(){
        studentList.forEach(student -> {
            if(namePredicate.and(agePredicate).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByNameAndAge();
    }
}
