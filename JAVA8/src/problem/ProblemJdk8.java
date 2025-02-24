package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemJdk8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};

        int curret_sum = Arrays.stream(arr).sum();
        int all_sum=IntStream.range(0,10).sum();
        System.out.println(all_sum-curret_sum);

       List<Integer> nums= Arrays.stream(arr).boxed().collect(Collectors.toList());

     int result = IntStream.range(1,nums.size()+1).filter(i->!nums.contains(i)).findFirst().getAsInt();
        System.out.println(result);
    }
}
