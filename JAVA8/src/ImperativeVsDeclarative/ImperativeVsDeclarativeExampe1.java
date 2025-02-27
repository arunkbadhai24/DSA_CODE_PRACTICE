package ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExampe1 {

    public static void main(String[] args) {


        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+=i;

        }
        System.out.println("Sum using Imperative Approach :"+sum);

        // Declarative Style of Programming - What style of programming
        int sum1= IntStream.rangeClosed(0,100)
                .parallel()
                .sum();
        System.out.println("Sum using Declarative Approach : "+sum1);

    }




}
