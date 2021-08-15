/*
                                    *
                            *
                    *
            *
    *
*/

import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=1, nsp=n-1;
        while(k <= n){
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            
            nsp--;
            k++;
            
        }
        

    }
}