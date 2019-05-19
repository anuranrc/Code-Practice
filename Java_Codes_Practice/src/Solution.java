public class Solution {
    public  static int findMax(int[][] people){
        int recyear = Integer.MIN_VALUE;

        for(int i =0; i < people.length; i++){
            int j=0;
            int max = Integer.MIN_VALUE;
            int maxsofar = Math.max(people[i][j],people[i][j+1]);
            max = Math.max(maxsofar,max);
            if(recyear < max ){
                recyear = max;
            }
        }
        int size = recyear;
        int[] res= new int[size+1];
        for(int i =0; i < people.length; i++){
            int j=0;
            res[people[i][j]]= res[people[i][j]]+1;
            res[people[i][j+1]]= res[people[i][j+1]]-1;
        }
        int max = Integer.MIN_VALUE;
        int maxyear = 0;
        int countAlive = 0;

        for(int i=0; i< res.length; i++){
            countAlive+= res[i];
            if(countAlive >= max) {
                max = countAlive;
                maxyear = i;
            }
        }
       return  maxyear;
    }
   public  static void  main(String[]args){
        int[][] people = new int[5][2];
/*
       people[0][0] = 1900; people[0][1] = 1905;
        people[1][0] = 1901; people[1][1] = 1904;
        people[2][0] = 1904;people[2][1] = 1907;
        people[3][0] = 1910;people[3][1] = 1908;
        people[4][0] = 1909;people[4][1] = 1910;
*/

       people[0][0] = 0; people[0][1] = 1920;
       people[1][0] = 0; people[1][1] = 1940;
       people[2][0] = 0;people[2][1] = 1930;
       people[3][0] = 0;people[3][1] = 1940;
       people[4][0] = 0;people[4][1] = 1930;

        int maxyear = findMax(people);
       System.out.println(maxyear);
   }
}
