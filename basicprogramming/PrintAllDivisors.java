package basicprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDivisors {

    // Brute Force Approach

    // static void printDivisors(int n){
    //     System.err.println("Divisors of number "+ n+" is: ");
    //     for(int i=1;i<=n;i++){
           
    //         if(n%i==0){
    //             System.out.println(i);
    //         }
    //     }
    // }

    //Optimal Approach

    static void printDivisors(int n){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=1;i<=Math.ceil((Math.sqrt(n)));i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        System.err.println("Divisors of number "+ n+" is: ");
        for(int i : ans){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printDivisors(num);
    }

}
