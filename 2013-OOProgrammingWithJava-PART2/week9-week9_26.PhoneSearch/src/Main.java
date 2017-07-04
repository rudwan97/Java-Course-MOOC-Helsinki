import phonebook.domain.Phonebook;
import phonebook.ui.UserInterface;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        new UserInterface(reader, phonebook).startMenu(new File("src/phonebook/ui/menu.txt"));
    }
}
