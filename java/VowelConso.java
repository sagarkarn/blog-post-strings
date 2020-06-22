import java.util.Scanner;

public class VowelConso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Alphabetical Character ");
        char ch = scanner.nextLine().toLowerCase().charAt(0);
        /*
         *  note: java hasn't any method insert character so we use charAt()
         * charAt() return a character at index "n" of string
        */
        boolean isVowel = false;
        scanner.close();

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ // 
            isVowel = true;
        }

        if(isVowel){
            System.out.println(ch + " is Vowel Character");
        }
        else{
            System.out.println(ch + " is Consonent Character");
        }
    }
}