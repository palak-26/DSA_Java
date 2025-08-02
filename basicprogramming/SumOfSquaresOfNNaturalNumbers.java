package basicprogramming;

import java.util.Scanner;

public class SumOfSquaresOfNNaturalNumbers {
    static int sum(int n){
        // int s=0;
        int s=(n*(n+1)*(2*n+1))/6;
        // for(int i=1;i<=n;i++){
        //     s+=(i*i);
        // }
        return  s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which sum is to be calculated:");
        int n= sc.nextInt();
        System.out.println("Sum of squares of "+n+" natural numbers is: "+ sum(n) );
    }
}
