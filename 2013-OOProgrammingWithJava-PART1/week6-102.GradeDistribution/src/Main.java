import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        grades(reader);
    }

    public static void grades(Scanner reader) {
        String five = "5: ";
        String four = "4: ";
        String three = "3: ";
        String two = "2: ";
        String one = "1: ";
        String zero = "0: ";
        int allscores = 0;
        int accepted = 0;
        System.out.println("Type exam scores, -1 completes:  ");
        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score < 0) {
                break;
            } else if (score < 30) {
                zero += "*";
                allscores++;
            } else if (score < 35) {
                one += "*";
                allscores++;
                accepted++;
            } else if (score < 40) {
                two += "*";
                allscores++;
                accepted++;
            } else if (score < 45) {
                three += "*";
                allscores++;
                accepted++;
            } else if (score < 50) {
                four += "*";
                allscores++;
                accepted++;
            } else if (score <= 60){
                five += "*";
                allscores++;
                accepted++;
            }
        }
        double distribution = 0;
        if (allscores != 0) {
            distribution = 100*accepted/allscores;
        }

        System.out.println("Grade distribution: ");
        System.out.println(five);
        System.out.println(four);
        System.out.println(three);
        System.out.println(two);
        System.out.println(one);
        System.out.println(zero);
        System.out.println("Acceptance percentage: " + distribution);

    }
}
