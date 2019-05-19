import java.util.Scanner;

public class BinarySearch {

    public static int bSearch(int[] arr,int tar){

        int end = arr.length-1;
        int low = 0;

        //int index =0;

        while(low < end ){
            int mid = (end-low+1)/2;
            if (arr[mid] == tar) return mid;
            else if (arr[mid] < tar){
                low = mid+1;
            }
            else if (arr[mid] > tar) {
                end = mid;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] arr = new int[5];

        System.out.println(" Enter the elements");

        for(int i =0; i < arr.length; i++){
            Scanner scan = new Scanner(System.in);
            arr[i]= scan.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int y = bSearch(arr, 3);
        System.out.println(y);
    }
}
