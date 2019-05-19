import java.util.*;

public class parallelRectangle {

    public static List<int[]> minAreaRect(int[][] points) {
        List<int[]> res = new ArrayList<>();
        //Set<int[]> set = new HashSet<>();
        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        for(int[] p : points){
            if(!map.containsKey(p[0])){
                map.put(p[0], new HashSet<>());
            }
            map.get(p[0]).add(p[1]);
        }

        int min = Integer.MAX_VALUE;

        for(int[] p1 : points){
            for(int[] p2 : points){
                if(p1[0] == p2[0] || p1[1] == p2[1]){
                    continue;
                }
                if(map.get(p1[0]).contains(p2[1]) && map.get(p2[0]).contains(p1[1]))
                    res.add(new int[]{p1[0],p1[1]});
                    res.add(new int[]{p2[0],p2[1]});
                    //set.add(new int[]{p1[0],p1[1]});
                    //set.add(new int[]{p2[0],p2[1]});

                    //min = Math.min(min, Math.abs((p1[0]-p2[0])*(p1[1]-p2[1])));
            }

        }
        //return min == Integer.MAX_VALUE ? 0 : min;
        return res;
    }


    public static  void main(String[] args){
        int[][] points = new int[5][5];
        points[0][0] =1;
        points[0][1] =1;
        points[1][0] =1;
        points[1][1] =3;
        points[2][0] =3;
        points[2][1] =1;
        points[3][0] =3;
        points[3][1] =3;
        points[4][0] =2;
        points[4][1] =2;
        //int res = minAreaRect(points);
        List<int[]> res = minAreaRect(points);

        for(int[] p: res){
            System.out.print("{");
            System.out.print(p[0]);
            System.out.print(",");
            System.out.print(p[1]);
            System.out.print("}");
        }
    }


}

