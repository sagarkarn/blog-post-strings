import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("Enter your name: ")
    var str = scanner.nextLine()

    System.out.println("Hello "+ str)
}