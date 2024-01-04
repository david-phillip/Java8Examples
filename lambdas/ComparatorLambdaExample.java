package learn.java.lambdas;

import org.omg.PortableInterceptor.IORInterceptor;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        //Exising
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of comparator " + comparator.compare(3,2));

        //Lambda
        Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);

        System.out.println("Result of comparator with lambda " + comparator1.compare(3,2));
    }
}
