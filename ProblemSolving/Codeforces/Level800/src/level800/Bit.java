package level800;

import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String v = input.next();
            if (v.contains("--")) {
                x--;
            } else if (v.contains("++")) {
                x++;
            }
            

        }
        System.out.println(x);
    }
}
