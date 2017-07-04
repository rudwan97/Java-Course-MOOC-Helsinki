import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {

        String result = "";

        int i = text.length() - 1;
        while (i >= 0) {
            result += text.charAt(i);  // same as result = result + text.charAt(i);
            i--;
        }

        return result;
    }

    public static boolean palindrome(String text) {
        // write code here
        if (reverse(text).equals(text)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
