package level800;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int Tonya = input.nextInt();
            int Vasya  = input.nextInt();
            int Petya = input.nextInt();
           int  sum=Tonya+Vasya+Petya;
            if (sum>=2) {
                count++;
            }

            }

        System.out.println(count);
        }

    }


