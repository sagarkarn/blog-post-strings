import java.util.Scanner;

fun main() {
    

    val scanner = Scanner(System.`in`);
    System.out.print("Enter text: ");
    var str = scanner.nextLine();
    
    
    var word = 1;
    for(ch in str.toCharArray()){
        if(Character.isWhitespace(ch)){
            word++;
        }
    }
    println("Number of word: " + word);     

}