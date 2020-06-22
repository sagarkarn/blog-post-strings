import java.util.Scanner;

fun main() {
    

    val scanner = Scanner(System.in);
    System.out.println("Enter Text: ");
    var str = scanner.nextLine();
    
    
    //without using function
    var ch = str.toCharArray(); // character array
    var l = 0;
    for(c in ch){ //for each loop
        l++;
    }
    println("Length of text " + l );

    //using length() function
}