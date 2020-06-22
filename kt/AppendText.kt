import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    print("Enter first text: ")
    var first: String = scanner.nextLine()
    print("Enter second text: ")
    var second: String = scanner.nextLine()

    first = first + second
    println("Append text: " + first)
}