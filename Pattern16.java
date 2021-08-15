import java.util.*;

public class Pattern16 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 2*n - 3;
        int nst = 1;
        int row = 1;
        while(row <= n){
            for(int i=1; i<=nst; i++){
                System.out.print(i + "\t");
            }
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            if(row == n){
                nst -= 1;
            }
            for(int i=nst; i>=1; i--){
                System.out.print(i + "\t");
            }
            System.out.println();
            row++;
            nst++;
            nsp-=2;
        }
    }
}
