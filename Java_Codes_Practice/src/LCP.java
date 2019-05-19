public class LCP {


    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            //System.out.println(pre);
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
                System.out.println(pre);
            } //System.out.println(strs[i]);
            i++;
        }
        return pre;
    }

    public static void main(String[] args){

        String[] strs = new String[4];
        strs[0] = "leetcode";
        strs[1] = "leet";
        strs[2] = "leesode";
        strs[3] = "leetv";

        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}
