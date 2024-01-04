package learn.java.functionalInterfaces;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> supplier = () ->{
            return new Student("John",
                    20, Arrays.asList("travelling", "eating"),
                    5.5F);

    };

        System.out.println(supplier.get());;

        Supplier<List<Student>> studentListSupplier = () -> StudentDatabase.getStudentList();

        System.out.println(studentListSupplier.get());;
}}
