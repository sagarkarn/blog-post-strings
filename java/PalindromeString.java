import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine();
        scanner.close();

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            final char ch = str.charAt(i);
            reverseStr += ch;
        }

        if (str.equals(reverseStr)) {
            /*
             * str is object Reference of String class so we can't compare with "=="
             * operator
             */

            System.out.println("Palindrome String");

        } else {
            System.out.println("Palindrome String");
        }
    }
}