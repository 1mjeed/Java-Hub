 
package level800;

import java.util.Scanner;


 
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int limak = inpt.nextInt();
        int bob = inpt.nextInt();
        int time =0;
        while (bob>=limak) {
                limak=limak*3;
                bob=bob*2; 
                time++;     
             }
        System.out.println(time);
    }

}
