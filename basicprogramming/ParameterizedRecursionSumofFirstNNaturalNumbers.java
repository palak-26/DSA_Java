package basicprogramming;

import java.util.Scanner;

public class ParameterizedRecursionSumofFirstNNaturalNumbers {
    static void sum(int i, int sum){
        int n=i;
        if(i<1) {
             System.out.println("Sum of first "+n+ " natural numbers is: "+sum );
             return ;
        }

        sum(i-1,sum+i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sum(num,0);
       
    }

}
