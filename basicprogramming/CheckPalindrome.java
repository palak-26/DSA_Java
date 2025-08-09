package basicprogramming;

import java.util.Scanner;

public class CheckPalindrome {
    static boolean isPalindrome(int num){
        int n= num;
        int rev=0;
        while(num!=0){
            int d=num%10;
            rev = rev*10+d;
            num/=10;

        }

        if(rev==n){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The given number "+num+" is: Palindrome");
        }
        else{
            System.out.println("The given number "+num+ " is: Not Palindrome");
        }
    }

}
