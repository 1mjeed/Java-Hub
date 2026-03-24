 
package level800;

import java.util.Scanner;

 
public class Translation {
    public static void main(String[] args) {
        Scanner iput = new Scanner(System.in);
        String fi=iput.next();
        String sc=iput.next();
        int count=0;
        int r = 0 ;
        int l =sc.length()-1;
        System.out.println(sc.length());
        if (fi.length()==sc.length()) {
            
        for (int i = 0; i < fi.length(); i++) {
            
            if (fi.charAt(r)==sc.charAt(l)) {
                count++;
                l--;
                r++;
            }
            else{ break;}
         }
        }
        System.out.println(count==fi.length()? "YES" :"NO");
    }
    }

