package learn.java.functionalInterfaces;

public class FunctionExample2 {

    static String performConcat(String str){
       return FunctionExample.function
               .andThen(FunctionExample.concatFunction)
                .apply(str);
    }

    public static void main(String[] args) {
        String result = FunctionExample2.performConcat("David");
        System.out.println(result);
    }
}
