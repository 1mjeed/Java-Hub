package beginnerquestions;


public class ReverseString {

    public static void main(String[] args) {
        String string = "123456789";

        theFirstWay(string);
        //--------------------------
        theSecondWay(string);
         

    }

    private static void theFirstWay(String string) {
        StringBuilder str = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            str.append(string.charAt(i));
        }
        System.out.println(str);
        System.out.println("differ "+str.reverse());
        

    }

    private static void theSecondWay(String string) {

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }

    }

}
