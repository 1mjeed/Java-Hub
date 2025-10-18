package level800;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kilos = input.nextInt();
        if (kilos % 2==0 && kilos>2) 
            System.out.println("YES");
        
        else
            System.out.println("No");

    }

}
