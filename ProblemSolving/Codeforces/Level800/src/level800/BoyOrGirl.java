package level800;
import java.util.Scanner;
import java.util.HashSet;  

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        HashSet<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < x.length(); i++) {
            uniqueChars.add(x.charAt(i)); 
        }
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}