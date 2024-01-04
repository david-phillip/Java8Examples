package learn.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

    static Comparator<Integer> integerComparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3,5));

        System.out.println(BinaryOperator.maxBy(integerComparator).apply(10,20));
        System.out.println(BinaryOperator.minBy(integerComparator).apply(10,20));
    }
}
