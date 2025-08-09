package basicprogramming;

import java.util.Scanner;

public class AmstrongNumber {
    static boolean isAmstrong(int num){
        int n =num , n1 = num;
        int count=0;
        int sum=0;
        while(num!=0){
            count++;
            num/=10;
        }

        while(n!=0){
            int d = n%10;
            sum+= Math.pow(d, count);
            n/=10;
        }

        if(n1==sum) return true;
        else return false;


    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isAmstrong(num)){
            System.out.println("The given number "+ num + " is: Amstrong");
        }
        else{
            System.out.println("The given number "+ num + " is: Not Amstrong");
        }
    }

}
