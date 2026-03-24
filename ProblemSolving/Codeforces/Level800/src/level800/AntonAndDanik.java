 
package level800;

    import java.util.Scanner;


    public class AntonAndDanik {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String x = input.next();
        int a =0 ;  
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i)=='A') {
                    a++;
                }else a--; 
            }
            System.out.println(a>0 ? "Anton" : a<0 ?"Danik":"Friendship");





        }

    }
