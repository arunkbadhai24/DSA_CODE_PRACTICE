package array;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int arr[] =new int[N];

        for(int i=0;i<N;i++) {

            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j=N-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int ar:arr){
            System.out.print(ar+" ");
        }
    }
}
