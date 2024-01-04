package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    //static Predicate<Student> p1 = s -> s.getName().startsWith("C");
    //static Predicate<Student> p2 = s -> s.getAge() == 15;

    static BiPredicate<Integer, Float> biPredicate = (age, grade) -> age > 10 && grade > 3.0;

    static BiConsumer<String, Float> studentBiConsumer =
            (name, grade) -> System.out.println(name + " : " + grade);

    static Consumer<Student> studentConsumer = (student -> {
        //if(p1.and(p2).test(student)){
        if(biPredicate.test(student.getAge(), student.getGrade())){
            studentBiConsumer.accept(student.getName(),student.getGrade());
        }
    });

    public static void getStudentListByAgeAndGrade(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getStudentList();
        BiPredicateExample.getStudentListByAgeAndGrade(studentList);
    }
}
