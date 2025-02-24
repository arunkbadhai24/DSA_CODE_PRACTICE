package test;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N1 = 100;

        for (int num =2;num <= N1; num++){

            boolean isPrime = true;

            for (int i =2 ; i<num ; i++){

                if(num % i ==0){
                    isPrime = false;
                    break;
                }


            }
            if(isPrime){
                System.out.println(num);
            }
        }
    }

}
