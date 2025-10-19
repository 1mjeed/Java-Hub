 
package level800;

import java.util.Scanner;

 
public class Next_Round {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  
        int k =input.nextInt();  
        int count = 0 ; 
        int grab []= new int[n];
        
        for (int i = 0; i < n; i++) {
             grab[i] = input.nextInt();
            if (grab[i]>=grab[k-1] && grab[i]>0) {
                count++;
            }
            
        }
        System.out.println(count);
        
        
        
    }

}
