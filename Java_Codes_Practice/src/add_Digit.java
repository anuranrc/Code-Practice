import java.util.Scanner;

public class add_Digit {


    public static int Solution(int num){
        if (num==0) return 0;
        else if (num%9==0){
            return 9;
        }
        else return num%9;
    }

    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        int a = digit.nextInt();
        int x = Solution(a);
        System.out.println("The sum of the digit is :" + x);
    }

}