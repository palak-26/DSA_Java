import java.util.*;


public class N_BinaryString{
    int[] A;
    public N_BinaryString(int n){
        A= new int[n];
    } 

    public void binaryString(int n){
        if(n<=0) {
            System.out.println(Arrays.toString(A));
        }
        else{
            A[n-1]=0;
            binaryString(n-1);
            A[n-1]=1;
            binaryString(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        N_BinaryString s = new N_BinaryString(n);
        s.binaryString(n);
    }
}
