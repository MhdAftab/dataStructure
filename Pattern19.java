import java.util.*;

public class Pattern19{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = 1, nst = (n/2)+1, nsp1= n/2, nsp2 = nsp1-1;
        while(k <= n){
            if(k == 1){
                for(int i=0; i<nst; i++){
                    System.out.print("*	");
                }
                for(int i=0; i<nsp2; i++){
                    System.out.print("	");
                }
                System.out.print("*	");
            }
            else if(k <= n/2){
                for(int i=0; i<nsp1; i++){
                    System.out.print("	");
                }
                System.out.print("*	");
                for(int i=0; i<nsp2; i++){
                    System.out.print("	");
                }
                System.out.print("*	");
            }else if(k == (n/2)+1){
                for(int i=0; i<n; i++){
                    System.out.print("*	");
                }
            }else if(k >(n/2)+1 && k < n){
                System.out.print("*	");
                for(int i=0; i<nsp2; i++){
                    System.out.print("	");
                }
                System.out.print("*	");
            }else if(k == n){
                System.out.print("*	");
                for(int i=0; i<nsp2; i++){
                    System.out.print("	");
                }
                for(int i=0; i<nst; i++){
                    System.out.print("*	");
                }
                
                
            }
            System.out.println();
            k++;
        }
    }
}