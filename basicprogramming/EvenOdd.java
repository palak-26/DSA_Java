package basicprogramming;
import  java.util.*;

public class EvenOdd {
    static String evenOdd(int n){
        String status="";
        if(n%2 == 0)
            status= "Even";
        else status="Odd";

        return status;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The entered number "+ num +" is: "+evenOdd(num));
    }
    
}
