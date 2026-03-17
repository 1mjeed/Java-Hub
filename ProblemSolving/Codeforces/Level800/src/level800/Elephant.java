package level800;

import java.util.Scanner;

public class Elephant {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int point = 0;
        int step = input.nextInt();
        while (step != 0) {
            if (step >= 5) {
                point++;
                step = step - 5;
            } else if (step == 4) {
                point++;
                step = step - 4;
            } else if (step == 3) {
                point++;
                step = step - 3;
            } else if (step == 2) {
                point++;
                step = step - 2;
            } else if (step == 1) {
                point++;
                step = step - 1;
            }

        }
        System.out.println(point);

    }

    void Anotherway() {
        int x = input.nextInt();

        int steps = x / 5; // عدد الخطوات الكاملة (ذات الحجم 5)

        if (x % 5 != 0) { // إذا كان هناك باقي قسمة (مسافة متبقية)
            steps++; // الفيل يحتاج خطوة واحدة إضافية فقط
        }

        System.out.println(steps);
    }
}
