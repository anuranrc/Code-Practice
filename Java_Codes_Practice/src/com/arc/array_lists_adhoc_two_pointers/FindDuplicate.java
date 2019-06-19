package com.arc.array_lists_adhoc_two_pointers;

/*
Problem Statement

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
find the duplicate one.
*/

import java.util.Arrays;
import java.util.HashSet;

/*

*/
public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {2,8,5,4,3,1,6,4,7};
        int result1 = findDuplicate1(nums);
        int result2 = findDuplicate2(nums);
        int result3 = findDuplicate3(nums);
        int result4 = findDuplicate4(nums);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

   /*
   TC: n log n SC: O(1)
   */

    public  static int findDuplicate1(int[] nums){
        if(nums.length < 2){
            throw new IllegalArgumentException();
        }
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i< nums.length-1;i++){
            if(nums[i]== nums[i+1])res = nums[i];
        }
        return  res;
    }

    //TC: O(n) SC: O(n)
    public static int findDuplicate2(int[] nums){
        if(nums.length < 2){
            throw new IllegalArgumentException();
        }

        HashSet<Integer> set = new HashSet<>();
        int res = 0;

        for(int i = 0; i< nums.length; i++) {
            if (set.contains(nums[i])) res = nums[i];
            else set.add(nums[i]);
        }
        return res;
    }


    //SC: O(n) SC: O(1)
    // Not efficient when the input is really big
    public static int findDuplicate3(int[] numbers) {

        if (numbers.length < 2) {
            throw new IllegalArgumentException("Finding duplicate requires at least two numbers");
        }

        int n = numbers.length - 1;

        int sumWithoutDuplicate = (n * n + n) / 2;

        int actualSum = 0;
        for (int number : numbers) {
            actualSum += number;
        }

        return actualSum - sumWithoutDuplicate;
    }

    //SC: O(n) SC: O(1)
    public  static int findDuplicate4(int[] nums)
    {
        if (nums.length > 1)
        {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }
}
