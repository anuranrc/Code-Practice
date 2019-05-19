public class Is_Unique {


    public static int Unique(String teststr){
        int x=0;

        for (int i = 0 ; i< teststr.length()-1; i++) {
            for (int j = i + 1; j < teststr.length(); j++) {
                if (teststr.charAt(i) == teststr.charAt(j)) return 1;
                ///else return -1;
            }
        }

        return -1;
    }

    public static  void main(String[] args){

        int un = 0;
        String s = "abcd";
        un = Unique(s);
        if(un == 1) {
            System.out.println("No");
        }
        else if(un == -1) System.out.println("Yes");
    }

}
