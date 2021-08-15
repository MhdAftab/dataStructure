import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2, nst = 1;
        int k=1;
        while(k <= n){
            for(int i=1; i<=nsp; i++){
                if(k == (n/2+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*\t");
            }
            if(k <= n/2){
                nst++;
            }else{
                nst--;
            }
            k++;
            System.out.println();
        }
    }
}