import java.util.Scanner

fun main() {
    

    val scanner = Scanner(System.`in`)
    print("Enter a Alphabetical Character ")
    var ch = scanner.nextLine().toLowerCase().toCharArray()[0]
    /*
        *  note: java hasn't any method insert character so we use charAt()
        * charAt() return a character at index "n" of string
    */
    
    var isVowel = if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ // 
        true
    } else false

    if(isVowel){
        println("Vowel Character")
    }
    else{
        println("Consonent Character")
    }


}