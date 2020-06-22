import java.util.Scanner;

public class CountVowelConso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scanner.nextLine().toLowerCase();//convert to lower case
        scanner.close();
        int vowel = 0;
        int conso = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 97 && ch <=122){
                if(ch == 'a' || ch == 'e' || ch == 'i' && ch == 'o' && ch == 'u'){
                    vowel++;
                }
                else{
                    conso++;
                }
            }
        }
        System.out.println("Number of vowel: " + vowel);
        System.out.println("Number of consonent: " + conso);
    }
}