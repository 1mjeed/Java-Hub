 
package level800;

import java.util.Arrays;
import java.util.Scanner;

 
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char random =word.toUpperCase().charAt(0);
        char end []= word.toCharArray();
        end[0]= random;
        System.out.print(end);
        
        
    }
}
