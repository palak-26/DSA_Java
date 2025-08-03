package basicprogramming;

import java.util.Scanner;

public class OppositeFaceOfDice {
    static int findFaceNumber(int n){
        //Naive approach
        // if(n==1 || n==6){
        //     if(n==1) face= 6;
        //     else face= 1;
        // }
        // else if(n==2 || n==5){
        //     if(n==2) face= 5;
        //     else face= 2;
        // }
        // else{
        //     if(n==4) face=3;
        //     else face=4;
        // }
        // return face;

        return 7-n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number on face of dice:");
        int faceNumber = sc.nextInt();
        System.out.println("The number on opposite side of face "+faceNumber+" is: "+ findFaceNumber(faceNumber));
    }

}
