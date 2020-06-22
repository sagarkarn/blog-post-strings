import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("Enter text: ")
    var str = scanner.nextLine()

    var reverseStr = ""
    for(i in str.length-1 downTo 0){
        val ch = str.toCharArray()[i]
        reverseStr += ch
    }
    println("After Reversing: "+reverseStr)   
}