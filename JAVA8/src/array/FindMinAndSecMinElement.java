package array;

import java.util.Scanner;

public class FindMinAndSecMinElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] =new int[100];

        int N = sc.nextInt();

        for(int i=0;i<N;i++) {

            arr[i] = sc.nextInt();
        }

        int minE=(int)(1e9);
        int secMinE=(int)(1e9);

        for (int i = 0; i < N; i++) {

            if(arr[i]<minE){
                secMinE=minE;
                minE=arr[i];
            }else if(arr[i]<secMinE && arr[i]>minE){
                secMinE =arr[i];
            }
        }

        System.out.println(secMinE);
        System.out.println(minE);
    }
}
