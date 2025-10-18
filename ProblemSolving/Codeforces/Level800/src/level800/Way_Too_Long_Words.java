package level800;

import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int number = input.nextInt(); 
         input.nextLine();
         for (int i = 0; i < number; i++) {
            String word =input.nextLine();
             if (word.length()>10) {
                 System.out.println(word.charAt(0)+""+(word.length()-2)+""+ word.charAt(word.length()-1));
                 
             }
             else
                 System.out.println(word);
        }
    }
}

