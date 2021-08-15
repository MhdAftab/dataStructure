import java.util.*;

public class Pattern15 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2;
        int nst = 1;
        int row=1, row2 = 1;
        while(row <= n){
            for(int i=1; i<=nsp; i++){
                System.out.print("\t");
            }
            for(int i=row2; i<=nst; i++){
                System.out.print(i+"\t");
            }
            for(int i=nst-1; i>=row2; i--){
                System.out.print(i+"\t");
            }
            System.out.println();
            if(row < n/2 + 1){
                nsp--;
                nst+=2;
                row2++;
            }else{
                nsp++;
                nst-=2;
                row2--;
            }
            row++;
        }
    }
}
