package com.arc.array_lists_adhoc_two_pointers;

import java.util.HashMap;

public class Fibonacci {

    private static int fibonacciRecursive(int n){
        if(n <0) throw new IllegalArgumentException();
        if(n ==0 || n == 1) return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Recursive Solution with Memoization
    private static HashMap<Integer, Integer> memo = new HashMap<>();
    private static int fibonacciRecMemo(int n){
        if(n< 0) throw new IllegalArgumentException();
        if(n==0 || n==1) return n;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fibonacciRecMemo(n-1) + fibonacciRecMemo(n-2);
        memo.put(n, result);
        return result;
    }

    //Dp Solution with space O(n)
    private static int fibonacciDynamic(int n){
        if(n< 0) throw new IllegalArgumentException();
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=n;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 20;
        long startTime1 = System.nanoTime();
        System.out.println(startTime1);
        int fibRec = fibonacciRecursive(n);
        long endTime1 = System.nanoTime();
        System.out.println(endTime1);
        long startTime2 = System.nanoTime();
        int fibRecMemo = fibonacciRecMemo(n);
        long endTime2 = System.nanoTime();
        long startTime3 = System.nanoTime();
        int fibDyn = fibonacciDynamic(n);
        long endTime3 = System.nanoTime();

        System.out.println("Time elapsed for recursive solution:   " + (endTime1-startTime1)+ " result: "+fibRec);
        System.out.println("Time elapsed for Recursive memoization:   " + (endTime2-startTime2)+ "  result: "+fibRecMemo);
        System.out.println("Time elapsed for Dp solution:   " + (endTime3-startTime3)+ "result: "+fibDyn);
    }
}
