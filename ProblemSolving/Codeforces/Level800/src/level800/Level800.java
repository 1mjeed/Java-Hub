//@author mjnas
package level800;

import java.util.Scanner;


public class Level800 {

     
    public static void main(String[] args) {
      /*All questions solved at level 800 */
      
        Scanner input = new Scanner(System.in);
         int x = input.nextInt(); 
         input.nextLine();
         for (int i = 0; i < x; i++) {
            String word =input.nextLine();
             if (word.length()>10) {
                 System.out.println(word.charAt(0)+""+(word.length()-2)+""+ word.charAt(word.length()-1));
                 
             }
             else
                 System.out.println(word);
        }

   
    }

}
