package basicprogramming;

import java.util.Scanner;

public class FunctionalWaySumofFirstNNaturalNumbers {
    // static int sum(int n){
    //     if(n==0) return 0;

    //     return n+ sum(n-1);
    // }

    static int sum(int i, int n){
        if(i==n) return n;

        return i+ sum(i+1, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The sum of first "+num+" numbers is: "+ sum(1,num));
    }

}
