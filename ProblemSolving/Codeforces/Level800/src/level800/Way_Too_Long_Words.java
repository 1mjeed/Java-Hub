package level800;

import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // عدد الكلمات
        input.nextLine(); // للتخلص من السطر الجديد بعد الرقم

        for (int i = 0; i < n; i++) {
            String word = input.nextLine();
            if (word.length() > 10) {
                int middle = word.length() - 2;
                System.out.println(word.charAt(0) + "" + middle + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}

