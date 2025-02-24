package test;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int K = sc.nextInt();
        int J = sc.nextInt();

        int count =0;

        while(count < J){

            for(int N =L ; N<=R; N++)
            {

                int sum =0;

                for(int num = N ; num>0;num /=10){

                    int lastDigit = num % 10;
                    sum+= lastDigit;

                }

                if(sum == K){
                    count++;
                    System.out.println(N +" : "+sum);
                    //System.out.println("Count :"+count);
                }

                //System.out.println("J :"+J);

            }
        }
    }

}
