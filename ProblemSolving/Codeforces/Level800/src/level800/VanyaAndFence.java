 
package level800;

import java.util.Scanner;

 
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int friends =input.nextInt();
        int heightfence =input.nextInt();
        int heightfriend[]=new int[friends] ;
        int x=0; int y =0;
        for (int i = 0; i < friends; i++) {
            heightfriend[i]=input.nextInt();
            if (heightfriend[i]>heightfence) {
                x++;
            }else y++ ;
        }
        System.out.println((x*2)+y);
        
    }
}
