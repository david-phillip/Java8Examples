package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {

    static Predicate<Student> p1 = s -> s.getName().startsWith("C");
    static Predicate<Student> p2 = s -> s.getAge() == 15;
    static BiConsumer<String, List<String>> studentBiConsumer =
                    (name, activities) -> System.out.println(name + " : " + activities);

    static Consumer<Student> studentConsumer = (student -> {
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });

    public static void getStudentListByNameAndAge(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getStudentList();
        ConsumerAndPredicateExample.getStudentListByNameAndAge(studentList);
    }
}
