public class MultiplyProblem {
    public static int[] multiply(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr1[i]*arr2[i%arr2.length];
        }
        return arr1;
    }
    /*
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2={4,5};
        int[] res = multiply(arr1, arr2);
        for(int n: res){
            System.out.print(n+" ");
        }
    }
    */
}
