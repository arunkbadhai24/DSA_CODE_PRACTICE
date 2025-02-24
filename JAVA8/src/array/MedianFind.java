package array;

import java.util.Scanner;

public class MedianFind {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int arr[] =new int[N];

        for(int i=0;i<N;i++) {

            arr[i] = sc.nextInt();
        }

        if(N%2!=0){
            System.out.println((arr[N/2]));
        }else{
           double median = (double)(arr[N/2] +arr[(N/2)-1])/2.0;
            System.out.println(median);
        }
    }
}
