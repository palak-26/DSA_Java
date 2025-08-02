package basicprogramming;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    static int sum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        return  s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which sum is to be calculated:");
        int n= sc.nextInt();
        System.out.println("Sum of "+n+" natural numbers is: "+ sum(n) );
    }
}
