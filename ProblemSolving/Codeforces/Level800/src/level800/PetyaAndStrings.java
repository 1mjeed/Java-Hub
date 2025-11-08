package level800;

import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next().toLowerCase();
        String s2 = input.next().toLowerCase();

         int r = s1.compareTo(s2);

        if (r > 0) {
            System.out.println("1");
        } else if (r < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }

}
