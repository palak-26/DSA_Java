package basicprogramming;
import  java.util.*;

public class EvenOdd {
    static boolean  evenOdd(int n){
        
        if(n%2 == 0)
            return true;
        else return false;

        
    }
    public static void main(String[] args)throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(evenOdd(num)){
            System.out.println("The entered number "+ num +" is: Even ");
        }
        else{
            System.out.println("The entered number "+ num +" is: Odd");
        }
    }
    
}
