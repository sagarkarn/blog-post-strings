import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String first = scanner.nextLine();
        System.out.print("Enter second text: ");
        String second = scanner.nextLine();
        scanner.close();

        boolean equal = true;
        if(first.length() != second.length()){
            equal = false;
        }
        if(equal){
            for(int i = 0; i < first.length(); i++){
                char ch1 = first.charAt(i);
                char ch2 = second.charAt(i);
                if(ch1 != ch2){
                    equal = false;
                    break;                   
                }
            }
        }
        if(equal){
            System.out.println("equal texts");
        }else{
            System.out.println("not equal texts");
        }

    }
}