package basicprogramming;

import java.util.Scanner;

public class ClosestDivisibleNumber {
    static void closestNum(int n, int m){
        int closest=0;
        int minDiff = Integer.MAX_VALUE;

        for(int i= n - Math.abs(m); i<= n+ Math.abs(m); ++i){
            if(i%m==0){
                int diff = Math.abs(n-i);

                if(diff< minDiff || (diff==minDiff && Math.abs(i)>Math.abs(closest))){
                    closest =i;
                    minDiff = diff;
                }
            }
        }
        System.out.println(closest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number:");
        int num2 = sc.nextInt();
        closestNum(num1, num2 );
    }

}
