package basicprogramming;

import java.util.Scanner;

public class SwapTwoNumbers {
    static void swap(int n1, int n2){
        System.out.println("Numbers before swapping are:"+ n1+ " " + n2);
        int temp;
        // temp= n1;
        // n1=n2;
        // n2=temp;

        // temp=n1+n2;
        // n1= n2;
        // n2= temp-n1;

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("Swapped Numbers are:"+ n1+ " " + n2);
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1,num2);
    }

}
