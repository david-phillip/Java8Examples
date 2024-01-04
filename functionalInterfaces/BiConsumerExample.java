package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void getStudentNameAndActivities(){
        List<Student> studentList = StudentDatabase.getStudentList();
        BiConsumer<String, List<String>> biConsumer2 =
                (name, activities) -> System.out.println("Student name : " + name +
                                                         ", Student activities : " + activities);
        studentList.forEach((student) -> biConsumer2.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer =
                (a,b) -> System.out.println("FirstName : " + a + " , SecondName : " + b);

        biConsumer.accept("David", "Phillip");

        BiConsumer<Integer, Integer> multiply =
                (a,b) ->  System.out.println("Multiply result : " + a * b);

        BiConsumer<Integer, Integer> divide =
                (a,b) ->  System.out.println("Divide result : " + a / b);

        multiply.andThen(divide).accept(10,2);
        getStudentNameAndActivities();
    }
}
