package level800;

import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
         int number = input.nextInt(); 
         input.nextLine();
         for (int i = 0; i < number; i++) {
            String word =input.nextLine();
             if (word.length()>10) {
                 System.out.println(word.charAt(0)+""+(word.length()-2)+""+ word.charAt(word.length()-1));
                 
             }
             else
                 System.out.println(word);
=======
        int n = input.nextInt(); 
        input.nextLine();  

        for (int i = 0; i < n; i++) {
            String word = input.nextLine();
            if (word.length() > 10) {
                int middle = word.length() - 2;
                System.out.println(word.charAt(0) + "" + middle + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
>>>>>>> de9b64207f33ee91909ec07b8b71ba7e05b5e4f9
        }
    }
}

