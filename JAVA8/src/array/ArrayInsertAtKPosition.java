package array;

import java.util.Scanner;

public class ArrayInsertAtKPosition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


/*
        int N = sc.nextInt();
        int position =sc.nextInt();
        int value = sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++) {

            arr[i] = sc.nextInt();
        }*/
         int arr[]={10,20,30,40,50};
      //  int answer[] = new int[arr.length+1];

        int i=0;
        int j =0;
        int position=3;
        int value=26;
        int answer[] = new int[arr.length+1];
        while(j<answer.length){
            if(j==position-1){    // here the logic needs to be changed
                answer[j] =value;
            }else{
                answer[j] =arr[i];
                i++;
            }
            j++;




        }

        display( answer);
    }

    private static void display( int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
      //  System.out.println("");
    }
}
