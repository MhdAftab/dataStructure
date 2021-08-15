/*
    *
            *
                    *
                            *
                                    *
*/

import java.util.*;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=1, nsp=0;
        while(k <= n){
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            
            nsp++;
            k++;
            
        }
        

    }
}