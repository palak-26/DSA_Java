package basicprogramming;

import java.util.Scanner;

public class GreatestCommonDivisor {

    //Brute Force Approach

    // static int gcd(int n1, int n2){
    //     int gcd=1;
    //     for(int i=1; i<=Math.min(n1, n2);i++){
    //         if(n1%i ==0 && n2%i==0){
    //             gcd=i;
    //         }
            
    //     }

    //     return gcd;
    // }

    //Better Approach

    // static int gcd(int n1,int n2){
    //     for(int i=Math.min(n1, n2);i>0;i++){
    //         if(n1%i==0 && n2%i==0){
    //             return i;
    //         }

            
    //     }
    //     return 1;
    // }

    //Optimal Approach

    static int gcd(int n1, int n2){
        while(n2!=0){
            int temp= n2;
            n2 = n1%n2;
            n1=temp;
        }

        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Greatest Common Divisor of given two numbers "+num1+ " and "+ num2+ " is: "+ gcd(num1,num2));
    }
}
