package beginnerquestions;

 
import java.util.*;

public class Revese_an_Array {

    public static void main(String[] args) {
       
        
        
        int array[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length ; i++) {
            System.out.print (array[i]);
            

        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;

        }
        System.out.println("");
        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i]);

        }
        //Another way
        
        Data_structuring_method();

    }
   static void Data_structuring_method (){
   List <Integer> p = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
   Collections.reverse(p);
        System.out.println(p);
        
        
    }

}
