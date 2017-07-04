
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        printSmileys(characterString);
        if (isStringLengthOdd(characterString)) {
            System.out.println(":) " + characterString + "  :)");
        } else {
            System.out.println(":) " + characterString + " :)");
        }
        printSmileys(characterString);
    }

    private static void printSmileys(String characterString) {
        int numberOfSmileys = characterString.length()/2 + 3;
        if (isStringLengthOdd(characterString)) {
            numberOfSmileys = (characterString.length()+1)/2 + 3;
        }
        while (numberOfSmileys > 0) {
            System.out.print(":)");
            numberOfSmileys--;
        }
        System.out.println();
    }

    private static boolean isStringLengthOdd(String characterString) {
        return characterString.length() % 2 == 1;
    }

}
