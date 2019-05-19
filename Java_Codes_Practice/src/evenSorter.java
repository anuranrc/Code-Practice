

public class evenSorter {

    public static int[] evenSort(int[] arr){
        int temp;

        int evenPointer =0;
        int oddPointer = arr.length-1;

        while(evenPointer< oddPointer){
            if(arr[evenPointer] %2 ==0){
                evenPointer++;
            }
            else{
                temp = arr[evenPointer];
                arr[evenPointer] = arr[oddPointer];
                arr[oddPointer] = temp;
                oddPointer--;
            }
        }

        return arr;
    }

    public static void main(String[] args){
        int[] A = {2,5,7,9,6,2,4,8};
        int[] res = evenSort(A);

        for(int i = 0; i< res.length; i++) {
            System.out.print(res[i]);
        }
    }

}
