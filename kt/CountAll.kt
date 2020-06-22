import java.util.Scanner

fun main() {
    
    var scanner = Scanner(System.`in`)
    print("Enter text: ")
    var text: String = scanner.nextLine()
    

    var space = 0
    var digit = 0
    var upperCase = 0
    var lowerCase = 0
    var symbol = 0
    for(i in 0 until text.length){
        val ch = text.toCharArray()[i]
        if(Character.isWhitespace(ch)){
            space++
        }
        else if(Character.isDigit(ch)){
            digit++
        }else if(Character.isUpperCase(ch)){
            upperCase++
        }else if(Character.isLowerCase(ch)){
            lowerCase++
        }else{
            symbol++
        }
    }
    println("Number of space: " + space)
    println("Number of digit: " + digit)
    println("Number of upper case: " + upperCase)
    println("Number of lower case: " + lowerCase)
    println("Number of Special Character: " + symbol)
}