package level800;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int column=0;
         int row =0 ;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int x = input.nextInt();
                if (x == 1) {
                      row = i;
                      column = j;

                }

            }
            System.out.println("");

        }
        int x = Math.abs(row-3)+ Math.abs(column-3);
        System.out.println(x);

    }
}
