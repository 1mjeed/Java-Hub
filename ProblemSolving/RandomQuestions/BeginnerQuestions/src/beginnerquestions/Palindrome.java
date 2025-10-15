    package beginnerquestions;

    import java.util.Scanner;

    public class Palindrome {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word or name: ");
            String name =  input.nextLine();
            String nameLower = name.toLowerCase();
            int left = 0;
            int right = nameLower.length() - 1;

            while (left <= right) {
                if (nameLower.charAt(left) != nameLower.charAt(right)) {
                    System.out.println("--->  " + name + "  not Palindrome  ");
                    break;
                } else if (left == right) {
                    System.out.println("--->  " + name + "    Palindrome  ");
                    break;
                } else {
                    left++;
                    right--;

                }
            }

        }

    }
