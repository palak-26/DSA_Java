package pattern;

import java.util.Scanner;

public class NumPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i , bottom = (2*n-1)-1-i, left = j, right=(2*n-1)-1-j;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
}
