 
package level800;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowercase = 0 ; int uppercase =0 ; 
        String word = input.next(); 
        for (int i = 0; i < word.length(); i++) {
            if (word.toUpperCase().charAt(i)==word.charAt(i)) {
                uppercase++; 
            }
            else
                lowercase++;
        }      
            System.out.println(uppercase>lowercase? word.toUpperCase() : word.toLowerCase());       
    }
}
