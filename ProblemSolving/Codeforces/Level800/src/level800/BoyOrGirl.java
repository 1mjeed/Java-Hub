 
package level800;

import java.util.Scanner;

 
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next().toLowerCase();
        
        int count =0 ;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            boolean n = true;
            for (int j = 0; j < i; j++) {
                if (c == x.charAt(j) ) {
                    n=false; 
                    break;
                }
                
            }
            if (n) {
                count++; 
            }
        }
        if ( count%2==0) {
            System.out.println("CHAT WITH HER!");
        }
        else
          System.out.println("IGNORE HIM!");
   
        
        
        
    }

}
