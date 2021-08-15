/*
    *       *       *               *       *       *
    *       *                               *       *
    *                                               *
    *       *                               *       *
    *       *       *               *       *       *

*/

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 1, nst=(n/2)+1;
        int k = 1;
        while(k <= n){
            for(int i=1; i<=nst; i++){
                System.out.print("*\t");
            }
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*\t");
            }
            if(k < (n/2)+1){
                nsp+=2;
                nst-=1;
            }
            else{
                nsp-=2;
                nst+=1;
            }
            k++;
            System.out.println();
        }

    }
}