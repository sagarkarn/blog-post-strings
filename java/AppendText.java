import java.util.Scanner;

public class AppendText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String first = scanner.nextLine();
        System.out.print("Enter second text: ");
        String second = scanner.nextLine();
        scanner.close();

        first = first + second;
        System.out.println("Append text: " + first);
    }
}