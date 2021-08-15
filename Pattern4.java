/*
    *       *       *       *       *
            *       *       *       *
                    *       *       *
                            *       *
                                    *
*/

import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n, nsp=0;
        int k = 1;
        while(k <= n){
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*\t");
            }
            nsp++;
            nst--;
            k++;
            System.out.println();
        }

    }
}