 
package level800;

import java.util.Scanner;

 
public class Elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
         int point =0 ;int index =input.nextInt() ; 
        while (point<index) {
            if (point==index) {
                break;
            }
            if (point+5<index) {
                point=point+5;
            }
            else if (point+4<index) {
                point=point+4;
            }
            else if (point+3<index) {
                point=point+3;
            }
            else if (point+2<index) {
                point=point+2;
            }
            else if (point+1<index) {
                point=point+1;
            }
             }
        System.out.println(point);
        
    }

}
