import java.util.Scanner;

public class CountAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        scanner.close();

        int space=0,digit=0,upperCase=0,lowerCase=0,symbol=0;
        for(int i = 0; i < text.length(); i++){
            final char ch = text.charAt(i);
            if(Character.isWhitespace(ch)){
                space++;
            }
            else if(Character.isDigit(ch)){
                digit++;
            }else if(Character.isUpperCase(ch)){
                upperCase++;
            }else if(Character.isLowerCase(ch)){
                lowerCase++;
            }else{
                symbol++;
            }
        }
        System.out.println("Number of space: " + space);
        System.out.println("Number of digit: " + digit);
        System.out.println("Number of upper case: " + upperCase);
        System.out.println("Number of lower case: " + lowerCase);
        System.out.println("Number of Special Character: " + symbol);
    }
}