package phonebook.ui;

import phonebook.domain.PersonAddresses;
import phonebook.domain.PersonPhoneNumbers;
import phonebook.domain.Phonebook;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Phonebook phonebook;

    public UserInterface(Scanner reader, Phonebook phonebook) {
        this.reader = reader;
        this.phonebook = phonebook;
    }

    public void startMenu(File menu) throws Exception {
        Scanner reader = new Scanner(menu);
        String string = "";
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            string += line;
            string += "\n";
        }
        reader.close();
        System.out.println(string);
        command();
    }

    public void command() {

        while (true) {
            System.out.print("command: ");
            String option = reader.nextLine();
            if (option.equals("1")) {
                addNumber();
            }
            if (option.equals("2")) {
                searchNumber();
            }
            if (option.equals("3")) {
                searchPersonByNumber();
            }
            if (option.equals("4")) {
                addAddress();
            }
            if (option.equals("5")) {
                searchInformation();
            }
            if (option.equals("6")) {
                deleteInformation();
            }
            if (option.equals("7")) {
                filterInfo();
            }
            if (option.equals("x")) {
                break;
            }
        }
    }

    public void addNumber() {
        System.out.print("whose number: ");
        String person = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        phonebook.addPhoneNumber(new PersonPhoneNumbers(person, number));
        System.out.println();
    }

    public void searchNumber() {
        System.out.print("whose number: ");
        String person = reader.nextLine();
        phonebook.getPhoneNumbers(person);
        System.out.println();
    }

    public void searchPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        phonebook.searchByNumber(number);
        System.out.println();
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String person = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        phonebook.addAddress(new PersonAddresses(person, street + " " + city));
        System.out.println();
    }

    public void searchInformation() {
        System.out.print("whose information: ");
        String person = reader.nextLine();
        if (!phonebook.currentList().contains(person)) {
            System.out.println("  not found");
        } else {
            System.out.print("  ");
            phonebook.getAddresses(person);
            System.out.print("  ");
            phonebook.getNumberInfo(person);
            System.out.println();
        }
    }

    public void deleteInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        phonebook.removePerson(name);
        System.out.println();
    }

    public void filterInfo() {
        System.out.print("keyword (if empty, all listed): ");
        String input = reader.nextLine();
        System.out.println();
        List<String> person = phonebook.listFilter(input);
        if (person.isEmpty()) {
            System.out.println(" keyword not found");
        } else {
            Collections.sort(person);
            for (String name : person) {
                System.out.println(" " + name);
                System.out.print("  ");
                phonebook.getAddresses(name);
                System.out.print("  ");
                phonebook.getNumberInfo(name);
                System.out.println();
            }
        }
    }
}
