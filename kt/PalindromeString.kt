import java.util.Scanner

fun main() {
    
        val scanner = Scanner(System.`in`)
        print("Enter text: ")
        var str = scanner.nextLine()
        

        var reverseStr = ""
        for (i in str.length - 1 downTo 0) {
            val ch = str.toCharArray()[i]
            reverseStr += ch
        }

        if (str.equals(reverseStr)) {
            /*
             * str is object Reference of String class so we can't compare with equal ("==")
             * operator
             */

            print("Palindrome String")

        } else {
            print("Not Palindrome String");
        }   
}