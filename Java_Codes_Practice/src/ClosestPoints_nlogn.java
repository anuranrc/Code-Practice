import java.io.OutputStream;
import java.util.Arrays;

public class ClosestPoints_nlogn {
        public static int[][] kClosest(int[][] points, int K) {
            int len = points.length ;
            double [] dist = new double[len];
            int[][] closest = new int[K][2];

            for (int i = 0; i < len; i++){
                int x = points[i][0];
                int y = points[i][1];
                dist[i] = dists(x,y);
            }

            Arrays.sort(dist);
            double distK = dist[K-1];

            int c = 0;
            for(int i = 0; i < len; i++){
                if(dists(points[i][0],points[i][1] )<=distK){
                    closest[c] = points[i];
                    c++;
                }
            }
            return closest;        }

    public  static double dists(int a, int b){
        double d = 0.0;
        d =  Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
        return d;
    }
/*
    public static void main(String[] Args){
            int K = 2;
            int [][] arr = new int[4][2];
            //int [][] res = new int [K][2];
            arr[0][0] = 3;
            arr[0][1] = 3;
            arr[1][0] = 0;
            arr[1][1] = 6;
            arr[2][0] = 1;
            arr[2][1] = 3;
            arr[3][0] = 1;
            arr[3][1] = 1;


        int [][] res = kClosest(arr, K);

        for (int i = 0; i< K; i++){
            for (int j = 0; j< 2; j++){
                System.out.println(res[i][j]);
            }

        }

    }
*/
}


