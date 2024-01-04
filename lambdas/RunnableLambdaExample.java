package learn.java.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        //Existing
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable1).start();

        // Using lambda
        Runnable runnable2 = () -> System.out.println("Inside runnable 2");
        new Thread(runnable2).start();

        new Thread(() -> System.out.println("Inside runnable 3")).start();
    }


}
