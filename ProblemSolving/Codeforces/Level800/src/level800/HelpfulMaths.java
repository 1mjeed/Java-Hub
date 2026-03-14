 
package level800;

import java.util.Arrays;
import java.util.Scanner;

 
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String needsort= input.next();
        String sorted []=needsort.split("\\+");
          Arrays.sort(sorted);
          for (int i = 0; i < sorted.length; i++) {
              System.out.print(sorted[i]);
              if (i+1!=sorted.length) {
              System.out.print("+");
                  
              }
        }
          
                
      
       }
}
