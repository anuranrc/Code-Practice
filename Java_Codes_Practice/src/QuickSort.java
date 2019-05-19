public class QuickSort {

    public static void QSort(int[] arr){
        int start = 0;
        int end = arr.length-1;
        QuickSort(arr, start, end);
    }

    // QuickSort Method
    public  static void QuickSort(int[] arr, int start, int end){
        if(start <= end){
            int c = choosePivot(arr, start, end);
            swap(arr, c, start);
            int pi = Partition(arr, start, end);
            QuickSort(arr, start, pi-1);
            QuickSort(arr,pi+1,end);
        }
    }

    // swapping the pivot element with the start
    public static void  swap(int[] arr, int c, int p){
        int temp = 0;
        temp = arr[p];
        arr[p] = arr[c];
        arr[c] = temp;
    }

    // This is where the pivot is chosen from the Array
    public  static  int choosePivot(int[] arr, int start, int end){
        return end;
    }

    // Partition method
    // Returns partition index
    public  static int Partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int partIndex = 0;
        int lt = start;
        for(int curr = start+1; curr <= end; curr++){
            if(arr[curr] <= pivot){
                swap(arr, lt+1, curr);
                lt++;
            }
        }
        swap(arr, lt, start);
        partIndex = lt;
        return  partIndex;
    }
    // Main method
    public static void main(String[]args){
        int[] arr = {2,9,5,7,3,10,6};
        QSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
