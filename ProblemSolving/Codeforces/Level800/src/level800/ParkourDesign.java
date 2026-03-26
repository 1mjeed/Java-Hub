 
package level800;

import java.util.Scanner;

 
public class ParkourDesign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        int s1, s2;
        int x; 

        for (int i = 0; i < test; i++) {
            s1 = input.nextInt();
            s2 = input.nextInt(); 
            
            x = s1 + s2;
            
            System.out.println((x % 3 == 0 && s1 >= 2 * s2 && s1 >= -4 * s2) ? "YES" : "NO");
        }
    }
}
