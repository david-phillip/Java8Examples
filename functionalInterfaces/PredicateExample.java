package learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> checkEvenPredicate =
                (i) -> i%2==0;

        Predicate<Integer> checkDivisibleBy5Predicate =
                (i) -> i%5==0;

        System.out.println(checkEvenPredicate.test(100));
        System.out.println(checkEvenPredicate.negate().test(100));
        System.out.println(checkDivisibleBy5Predicate.test(11));
        System.out.println(checkDivisibleBy5Predicate.test(10));
        System.out.println(checkEvenPredicate.and(checkDivisibleBy5Predicate).test(100));
        System.out.println(checkEvenPredicate.and(checkDivisibleBy5Predicate).test(25));
        System.out.println(checkEvenPredicate.or(checkDivisibleBy5Predicate).test(25));
    }
}
