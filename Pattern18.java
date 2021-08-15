import java.util.*;

public class Pattern18{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 3, nsp = (n/2)-1;
        
        for(int i=1; i<=n; i++){
            if(i == 1){
                for(int j=1; j<=n; j++){
                    System.out.print("*	");
                }
            }else if(i <= (n/2)+1){
                for(int j=1; j<=n; j++){
                    if(i == j || i+j == n+1){
                        System.out.print("*	");
                    }else{
                        System.out.print("	");
                    }
                }
            }else{
                for(int j=1; j<=nsp; j++){
                    System.out.print("	");
                }
                for(int j=1; j<=nst; j++){
                    System.out.print("*	");
                }
                nsp--;
                nst+=2;
            }
            System.out.println();
        }
    }
}