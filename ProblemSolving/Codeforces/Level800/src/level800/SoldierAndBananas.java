package level800;

import java.util.Scanner;

public class SoldierAndBananas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars = 0;int p = 0;int wants =0 ; int cost = 0  ; 
        dollars=input.nextInt();
        p=input.nextInt();
        wants=input.nextInt();
        for (int i = 1; i <= wants; i++) {
            cost += dollars*i ;
        }
        int total = cost-p ; 
        if (total >0 ) {
         System.out.println(total);
        }else
         System.out.println(0);

    }
}
