/*

                                    *
                            *       *
                    *       *       *
            *       *       *       *
    *       *       *       *       *
*/

import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nsp = n-1;
        int nst = 1;
        for(int k=1; k<=n; k++){
            int i=nsp;
            while(i > 0){
                System.out.print("\t");
                i--;
            }
            i = 1;
            while(i <= nst){
                System.out.print("*\t");
                i++;
            }
            
            nst++;
            nsp--;
            System.out.println();
        }
    }
}