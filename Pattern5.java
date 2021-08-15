/*
                            *
                    *       *       *
            *       *       *       *       *
    *       *       *       *       *       *       *
            *       *       *       *       *
                    *       *       *
                            *

*/

import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1, nsp=n/2;
        int k = 1;
        while(k <= n){
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*\t");
            }
            if(k < (n/2)+1){
                nsp-=1;
                nst+=2;
            }
            else{
                nsp+=1;
                nst-=2;
            }
            k++;
            System.out.println();
        }

    }
}