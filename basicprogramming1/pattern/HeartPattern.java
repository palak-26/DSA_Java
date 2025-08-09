package pattern;

import java.util.Scanner;

public class HeartPattern {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n/2;i<n;i+=2){
            for(int j=0;j<n-i;j+=2){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=0;i<n/2;i++){
        //     for(int j=1;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0 ; k<(2*i)+1 ;k++){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }
        // for(int i=0;i<n/2;i++){
        //     for(int j=1;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0 ; k<(2*i)+1 ;k++){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }
        int num=n;
        for(int i=0;i<num+2;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-i)+3;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
