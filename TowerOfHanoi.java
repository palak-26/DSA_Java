import java.util.Scanner;

public class TowerOfHanoi {
    public static void solvePuzzle(int n , char fromPeg, char toPeg, char auxPeg){
        if(n==1){
            System.out.println("Move 1 disk from"+" "+fromPeg+"to"+toPeg);
            return ;
        }
           solvePuzzle(n-1, fromPeg, auxPeg, toPeg);
            System.out.println("Move disk from"+fromPeg+"to"+toPeg);
            solvePuzzle(n-1, auxPeg, toPeg, fromPeg);
            System.out.println("Move disk from"+fromPeg+"to"+toPeg);
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char peg1= sc.next().charAt(0);
        char peg2= sc.next().charAt(0);
        char peg3= sc.next().charAt(0);
        solvePuzzle(n, peg1, peg2, peg3);
    }
}
