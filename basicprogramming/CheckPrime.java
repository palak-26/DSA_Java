package basicprogramming;

import java.util.Scanner;

public class CheckPrime {

    //Brute Approach

    // static boolean isPrime(int n){
    //     int count =0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             count++;
    //         }
    //     }

    //     if(count==2){
    //         return true;
    //     }
    //     else return false;
    // }

    //Optimal Approach

    static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
           
            if(n%i==0){
                count++;

                if(n/i !=i){
                    count++;
                }
            }
        }

        if(count==2) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("The given number "+ num+ " is: Prime");
        }
        else{
            System.out.println("The given number "+num + " is: Not Prime");
        }
    }

}
