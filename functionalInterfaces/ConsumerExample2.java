package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c3 = (s) -> System.out.println(s.getActivities());

    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getStudentList();
        //studentList.forEach(c1);

        //studentList.forEach(c2.andThen(c3));

        studentList.forEach((s) -> {
            if(s.getAge() > 10){
                c2.andThen(c3).accept(s);
            }
        });

    }
}
