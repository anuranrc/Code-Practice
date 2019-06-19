// given an encoded string S which only contains [a-zA-Z0-9], decode the string as following:

// If the character read is a letter, the letter is written to the buffer.
// If the character read is a digit (say d), the entire buffer is repeated d-1 times in total.

// Now for the encoded string S, and an index K, find and return the K-th letter (1 indexed) in the decoded string

// for example
// s = abc2test2ok
// k = 12
// the result will be 'b'
// explain: the entire buffer is abcabctestabcabctestok

public class DecodeStringAtIndex {
    private static String decodeAtIndex(String S, int K) {
        if (S.length() == 0) return S;
        String decStr = decodeString(S);
        System.out.println(decStr);
        String let = kthLet(decStr, K);
        return let;
    }
    private static String decodeString(String S) {
        String res = "";
        int i = 0;
        while (i < S.length()) {

            if (!Character.isDigit(S.charAt(i))) {
                //StringBuilder currStr = new StringBuilder();
                res += S.charAt(i++);
            }

            if (Character.isDigit(S.charAt(i))) {
                int cnt = 0;
                while (Character.isDigit(S.charAt(i))) {
                    cnt = 10 * cnt + (S.charAt(i) - '0');
                    i++;
                }
                //stack.push(cnt);
                StringBuilder tempStr = new StringBuilder();
                for (int j = 0; j < cnt; j++) {
                    tempStr.append(res);
                }
                res = tempStr.toString();
                //i++;
            }
        }
        System.out.println(res);
        return res;
    }

    private static String kthLet(String decStr, int K) {
        String ret = "";
        if (decStr.length() < K) return ret;
        int cnt = 1;
        for (int i = 0; i < decStr.length(); i++) {
            if (cnt == K) {
                return String.valueOf(decStr.charAt(i));
            }
            cnt++;
        }
        return ret;
    }
    public static void main(String[] args) {
        String s = "abc2test2ok";
        int K =3;
        String result = decodeAtIndex(s, K);
        System.out.println(result);
    }

}