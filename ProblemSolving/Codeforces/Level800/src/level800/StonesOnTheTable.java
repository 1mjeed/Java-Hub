 
package level800;

import java.util.HashSet;
import java.util.Scanner;

 
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int repetition =0 ;
        String c =input.next() ;
        char s []=c.toCharArray();
        for (int i = 0; i < num-1; i++) {
            if (s[i]==s[i+1]) {
                repetition++ ;
            }}
        System.out.println(repetition);
       
        
        
        
        
        
    }
}
