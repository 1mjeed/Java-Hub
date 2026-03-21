package level800;

import java.util.Scanner;


 
public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            String x =String.valueOf(number);
            if (x.endsWith("0")) {
               number= number/10;
            }
            else
                number-=1;     
        }

        System.out.println(number);
        
        
        
        
    }
}
