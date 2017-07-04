import java.util.ArrayList;

/**
 * Created by Jeannette on 14/05/2017.
 */
public class Phonebook {
    private ArrayList<Person> phoneNumbers;

    public Phonebook() {
        this.phoneNumbers = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.phoneNumbers.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person: this.phoneNumbers) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person: this.phoneNumbers) {
            if (person.getName() == name) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
