import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String str = scanner.nextLine();

        scanner.close();

        System.out.println("Hello "+ str);
    }
}