package learn.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = s -> s.toUpperCase();

    static Function<String, String> concatFunction = s -> s.concat("World");


    public static void main(String[] args) {
        System.out.println("Result : " + function.apply("Hello"));
        System.out.println("Result : " + function.andThen(concatFunction).apply("Hello"));
        System.out.println("Result : " + function.compose(concatFunction).apply("Hello"));
    }
}
