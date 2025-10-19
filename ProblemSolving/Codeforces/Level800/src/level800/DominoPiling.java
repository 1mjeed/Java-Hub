package level800;

import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int array = m * n;
        int countd = 0;
        for (int i = 0; i < 10; i--) {
            if (array >1) {
                array = array - 2;
                countd++;
            } else {
                break;
            }

        }
        System.out.println(countd);

    }

}
