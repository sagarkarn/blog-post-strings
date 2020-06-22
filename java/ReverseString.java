import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine();
        scanner.close();

        String reverseStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            final char ch = str.charAt(i);
            reverseStr += ch;
        }

        System.out.println("After Reversing: "+reverseStr);
        
    }
}