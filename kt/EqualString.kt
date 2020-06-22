import java.util.Scanner

fun main() {
    
        val scanner = Scanner(System.`in`)
        print("Enter first text: ")
        var first = scanner.nextLine()
        print("Enter second text: ")
        var second = scanner.nextLine()

        // without using predefine method method
        var equal = true
        if(first.length != second.length){
            equal = false
        }
        if(equal){
            for(i in 0 until first.length){
                val ch1 = first.toCharArray()[i]
                val ch2 = second.toCharArray()[i]
                if(ch1 != ch2){
                    equal = false
                    break                   
                }
            }
        }
        if(equal){
            System.out.println("equal texts")
        }else{
            System.out.println("not equal texts")
        }
    
}