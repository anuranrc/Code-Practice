package com.arc.searching;

import java.util.Scanner;

public class BinarySearch {
    static Scanner scan = new Scanner(System.in);

    public static int bSearch(int[] arr,int tar){

        int end = arr.length-1;
        int low = 0;

        //int index =0;

        while(low < end ){
            int mid = low+ (end-low)/2;
            if (arr[mid] == tar) return mid;
            else if (arr[mid] < tar){
                low = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        //int[] arr = new int[5];
        int[] arr = {2,4,5,6,8,9};
        int target = 9;

//        System.out.println(" Enter the elements");
//
//        for(int i =0; i < arr.length; i++){
//            arr[i]= scan.nextInt();
//        }

//        System.out.println("Enter the number to search: ");
//        int target = scan.nextInt();
        int y = bSearch(arr,target);
        System.out.println(y);
    }
}
