 
package beginnerquestions;

 
public class NewClass {
    public static void main(String[] args) {
        String input = "Mogambo khush hua"; 
        String [] sp = input.split(" ");
        
        StringBuilder bi  = new StringBuilder(); 
        for (int i =sp.length-1; i>=0 ; i--) {
             bi.append(sp[i]);
             if (i!=0) {
                bi.append(" ");
            }
             
        }
        System.out.println(bi);
        
        
    }
}
