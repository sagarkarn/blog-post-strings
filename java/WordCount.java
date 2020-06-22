import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine();
        scanner.close();
        
        int word = 1;
        for(int i = 0; i < str.length(); i++){
            final char ch = str.charAt(i);
            if(Character.isWhitespace(ch)){
                word++;
            }
        }
        System.out.println("Number of word: " + word);     
    }
}