package learn.java.methodReferences;

import learn.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    public static void main(String[] args) {

        Supplier<Student> studentSupplier =
                Student::new;

        System.out.println(studentSupplier.get());

        Function<String, Student> studentFunction =
                Student::new;

        System.out.println(studentFunction.apply("David"));
    }
}
