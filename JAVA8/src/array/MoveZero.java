package array;

public class MoveZero {
    public static void main(String[] args) {

      //  Input: nums = [0,1,0,3,12]
      //  Output: [1,3,12,0,0]

        int nums[] = {0,1,0,3,12};
        int i = 0;
        int j = 0;

        while(i<nums.length) {

            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }

        for (int ar:nums){
            System.out.print(ar+" ");
        }
    }
}
