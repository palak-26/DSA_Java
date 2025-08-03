package pattern;

import java.util.Scanner;

public class SymmetryPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                if(n-1==j){
                    break;
                }
                System.out.print("* ");
            }
            for(int k=0;k<2*(n-i-1)-1;k++){
                System.out.print("  ");
            }
            for(int m=0;m<i+1;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("* ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("  ");
            }
            for(int m=0;m<=n-i-1;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
