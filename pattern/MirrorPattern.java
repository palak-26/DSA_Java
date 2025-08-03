package pattern;
import java.util.*;

public class MirrorPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<2*(i-1);k++){
                System.out.print("  ");
            }
            for(int m=0;m<=n-i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<2*(n-i-1);k++){
                System.out.print("  ");
            }
            for(int m=0;m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
