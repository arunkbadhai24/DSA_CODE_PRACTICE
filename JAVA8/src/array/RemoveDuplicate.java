package array;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int nums[]={1,1,1,2,3,3,4,4,5};
        int i =0;
        for(int j =1;j<nums.length;j++){

            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];

            }
        }


        System.out.println(i+"=="+Arrays.toString(nums));

    }

    }


