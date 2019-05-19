
import java.util.*;
public class countWays {

    public static int counts(int n, int[] arr){
        int count[] = new int[n+1];
        count[0]=1;


        for(int i=1;i<=n;i++){
            Set<Integer> visited= new  HashSet<>();
            for(int j=0;j<arr.length;j++){
                if(i>=arr[j] && !visited.contains(arr[j])) {
                    count[i] += count[i - arr[j]];
                    visited.add(arr[j]);
                }
            }
        }
        return count[n];
    }

    public static void main(String[] args){
        int[] arr={3,1,1,9,12};
        int n=2;
        int res = counts(n, arr);
        System.out.print(res);
    }
}
