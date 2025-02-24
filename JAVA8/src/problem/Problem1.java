package problem;

public class Problem1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        int current_sum=0;
        for(int a:arr){
            current_sum = current_sum + a;

        }

        int sum_all=(9*((9+1)/2));

        System.out.println(sum_all-current_sum);

    }
}
