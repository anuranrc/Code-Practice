public class DecodeWays {
    static int count;

    public static int decodeWays(String s){
        //int count =0;
        int n = s.length();
        if(s.length()==0) return 0;
        if (s.length()==1 && Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 9) return 1;
        if (s.length()>=2 && Integer.parseInt(s) >= 10 && Integer.parseInt(s) <= 26 ){
            count+=decodeWays(s.substring(0,1)) + decodeWays(s.substring(1,n));
            System.out.println(count);
            count+=decodeWays(s.substring(0,2)) + decodeWays(s.substring(2,n));
            System.out.println(count);
        }
    return count;
    }

    public static void main(String[] args) {
        String str= "226";
        int cnt = decodeWays(str);
        System.out.println(cnt);
    }
}
