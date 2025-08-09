package basicprogramming;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n=num;

        int count=0;

        while(num%10!=0){
            count++;
            num/=10;
        }

        System.out.println("Number of digits in given number "+n+" is:"+count);
    }

}
