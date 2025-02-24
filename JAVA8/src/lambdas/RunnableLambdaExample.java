package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * Prior to java8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Indside Runnable 1");
            }
        };

        new Thread(runnable).start();


        // Java 8 Lambda

        //()-> {};

        Runnable runnablelambda =()->{
            System.out.println("Inside Runnable 2");
        };

        Runnable runnablelambda1 =()->System.out.println("Inside Runnable 3");

        new Thread(runnablelambda).start();
        new Thread(runnablelambda1).start();
        new Thread(()->System.out.println("Inside Runnable 4")).start();
    }
}
