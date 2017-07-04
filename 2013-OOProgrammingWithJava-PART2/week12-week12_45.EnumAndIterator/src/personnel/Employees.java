package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> persons) {
        for (Person person : persons) {
            add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education title) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(title)) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education title) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(title)) {
                iterator.remove();
            }
        }
    }
}
