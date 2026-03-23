 
package level800;

import java.util.Scanner;

 
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        int x =0 ;
        long z;
        while (num>0) {
            z=num%10;
            if (z==7 || z==4) {
                x++;
            }
            num=num/10;
        }
        System.out.println(x==7 || x==4?  "YES":"NO");
    }
}
