import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
        scanner.close();

        char[] ch = str.toCharArray(); // character array
        int length = 0;
        for(char c : ch){ //for each loop
            length++;
        }
        System.out.println("Length of text " + length );
    }
}