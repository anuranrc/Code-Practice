package com.arc.array_lists_adhoc_two_pointers;

import java.util.HashMap;

public class twoSum {

    public static boolean two_Sum(int[] arr, int target){
        boolean res = false;

       HashMap<Integer, Integer > map = new HashMap<>();

         for(int i = 0; i< arr.length; i++){
             int cnt =0;
              if(! map.containsKey(arr[i])){
                  map.put(arr[i], cnt+1 );
              }
              else map.put(arr[i], map.get(arr[i])+1);
        }

        //for(Map.Entry<Integer, Integer> entry : map.entrySet()){

        for(int i = 0; i < arr.length; i++){
            if((arr[i] == target-arr[i]) && map.get(arr[i])>=2) {
                //res = true;
                return  true;
            }
            else {
                if ((arr[i] != target-arr[i]) && map.containsKey(target-arr[i])) {
                    //res = true;
                    return  true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr ={2, 2, 1,10,5,7};
        int target= 2;
        boolean result = two_Sum(arr, target);
        System.out.println(result);
    }
}
