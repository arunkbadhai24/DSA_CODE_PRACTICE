package array;

public class RotateRightArrayByk {
    public static void main(String[] args) {

        int k=3;
        int n=7;
        //less iteration
        k = k%n;
        int arr[]={1,2,3,4,5,6,7};
        int reverseArr[]=new int[n];
        for(int i=0;i<n;i++) {
            int newIndex= i+k;

            if(newIndex>=n){
                newIndex-=n;
            }
            reverseArr[newIndex]   =  arr[i];
            System.out.println(newIndex);
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(reverseArr[i]+" ");
        }
    }
}
