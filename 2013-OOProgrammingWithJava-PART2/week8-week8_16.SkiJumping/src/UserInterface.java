import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private JumpersList jumpers;

    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.jumpers = new JumpersList();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        participants();
    }

    public void participants() {
        System.out.println("Write the names of the participants one at a time; " +
                "an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            jumpers.add(new Jumper(name));
        }
        System.out.println();
        System.out.println("The tournament begins!\n");
        tournament();
    }

    public void tournament() {
        int round = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String choice = reader.nextLine();
            if (choice.equals("quit")) {
                System.out.println();
                System.out.println("Thanks!\n");
                System.out.println("Tournament results:");
                System.out.println("Position    Name");
                int position = 1;
                jumpers.reverse();
                for (Jumper jumper : jumpers.allJumpers()) {
                    System.out.println(position + "           " + jumper);
                    System.out.print("            jump lengths: ");
                    jumper.printElegantly();
                    position++;
                }
                break;
            }
            System.out.println();
            System.out.println("Round " + round + "\n");
            System.out.println("Jumping order:");
            jumpers.printJumpingOrder();
            System.out.println();
            results(round);
            round++;
        }
    }

    public void results(int round) {
        System.out.println("Results of round " + round);
        for (Jumper jumper : jumpers.allJumpers()) {
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.jumpLength());
            System.out.println("    judge votes: " + jumper.judgesScores());
        }
        System.out.println();
    }
}
