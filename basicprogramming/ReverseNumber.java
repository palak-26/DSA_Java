package basicprogramming;

import java.util.Scanner;

public class ReverseNumber {
    static  int reverse(int num){
        int rev=0;
        while(num!=0){
            int d=num %10;
            rev = rev*10 + d;
            num/=10;
        }

        return rev;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n= num;

        System.out.println("Reverse of the given number "+n+" is: "+ reverse(num));
    }
}
