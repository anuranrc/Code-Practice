package com.arc.array_lists_adhoc_two_pointers;

import java.util.Arrays;

/**
 * @author Anuran RC
 */
public class ValidTriangle {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        int res = triangleNumber(arr);
        System.out.println(res);
    }

        public static int triangleNumber(int[] nums) {
            int count =0;
            if(nums.length ==0) return count;
            Arrays.sort(nums);

            for(int i=0; i< nums.length-2; i++){

                int x =i+1, y = nums.length-1;

                while(x != y){
                    if(nums[i]+nums[x] > nums[y]) {
                        count+= 1;
                        y--;
                    }
                    else x++;

                }
            }
            return count;
        }

}
