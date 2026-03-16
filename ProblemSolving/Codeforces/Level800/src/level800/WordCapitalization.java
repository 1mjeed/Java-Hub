
    package level800;


    import java.util.Scanner;


    public class WordCapitalization {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String word = input.next();
            System.out.println(Character.toUpperCase(word.charAt(0))+word.substring(1));


        }
    }
