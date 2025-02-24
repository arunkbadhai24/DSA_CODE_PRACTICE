package array;

import java.util.Scanner;

public class ArrayInsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] =new int[100];

        int N = sc.nextInt();

        for(int i=0;i<N;i++) {

            arr[i] = sc.nextInt();
        }

        display(N, arr);

        //Delete from the end.
        if(N>=1){
            arr[N -1] = 0;
            N--;
        }
        display(N, arr);

        //Insert 15 at the end.
        if(N<100){

        }


        //Close the scanner
        sc.close();

    }

    private static void display(int N, int[] arr) {
        for (int i = 0; i< N; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
    }
}
