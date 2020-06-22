import java.util.Scanner

fun main() {

        val scanner = Scanner(System.`in`)
        print("Enter text: ")
        var str = scanner.nextLine().toLowerCase(); // convert to lower case
        scanner.close()
        var vowel = 0
        var conso = 0
        for (i in 0 until str.length) {
            var ch = str.toCharArray()[i]
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' && ch == 'o' && ch == 'u') {
                    vowel++
                } else {
                    conso++
                }
            }
        }
        System.out.println("Number of vowel: " + vowel)
        System.out.println("Number of consonent: " + conso)
}
