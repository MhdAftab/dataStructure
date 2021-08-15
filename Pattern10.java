/*
                    *
            *               *
    *                               *
            *               *
                    *
*/

import java.util.*;

public class Pattern10{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp1 = n/2, nsp2=-1;
        int k=1;
        while(k <= n){
            for(int i=1; i<=nsp1; i++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int i=1; i<=nsp2; i++){
                System.out.print("\t");
            }
            if(k == 1 || k == n){
                
            }else{
                System.out.print("*\t");
            }
            
            if(k <= n/2){
                nsp1--;
                nsp2 += 2;
            }else{
                nsp1++;
                nsp2-=2;
            }
            System.out.println();
            k++;
        }
    
    }
}