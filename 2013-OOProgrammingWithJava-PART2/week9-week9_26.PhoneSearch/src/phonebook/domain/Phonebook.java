package phonebook.domain;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> personPhoneNumbers;
    private Map<String , List<String>> personAddresses;

    public Phonebook() {
        this.personPhoneNumbers = new HashMap<>();
        this.personAddresses = new HashMap<>();
    }

    public void addPhoneNumber(PersonPhoneNumbers person) {
        if (personPhoneNumbers.get(person.getName()) == null) {
            personPhoneNumbers.put(person.getName(), new ArrayList<>());
        }
        personPhoneNumbers.get(person.getName()).add(person.getPhoneNumber());
    }

    public void addAddress(PersonAddresses person) {
        if (personAddresses.get(person.getName()) == null || person == null) {
            personAddresses.put(person.getName(), new ArrayList<>());
        }
        personAddresses.get(person.getName()).add(person.getAddress());
    }

    public Set<String> currentList() {
        Set<String> list = new HashSet<>();
        for (String name : personAddresses.keySet()) {
            list.add(name);
        }
        for (String name : personPhoneNumbers.keySet()) {
            list.add(name);
        }
        return list;
    }

    public void getPhoneNumbers(String name) {
        if (personPhoneNumbers.get(name) == null) {
            System.out.println("  not found");
        } else {
            List<String> phoneNumbers = personPhoneNumbers.get(name);
            for (String number : phoneNumbers) {
                System.out.println(" " + number);
            }
        }
    }

    public void getNumberInfo(String name) {
        if (personPhoneNumbers.get(name) == null) {
            System.out.println("phone number not found");
        } else {
            List<String> phoneNumbers = personPhoneNumbers.get(name);
            System.out.println("phone numbers: ");
            for (String number : phoneNumbers) {
                System.out.println("   " + number);
            }
        }
    }

    public void getAddresses(String name) {
        if (personAddresses.get(name) == null) {
            System.out.println("address unknown");
        } else {
            List<String> addresses = personAddresses.get(name);
            for (String address : addresses) {
                System.out.println("address: " + address);
            }
        }
    }

    public void searchByNumber(String number) {
        int found = 0;
        for (String name : personPhoneNumbers.keySet()) {
            List<String> numbers = personPhoneNumbers.get(name);
            if (numbers.contains(number)) {
                System.out.println(" " + name);
                found++;
            }
        }
        if (found == 0) {
            System.out.println(" not found");
        }
    }

    public void removePerson(String name) {
        personPhoneNumbers.remove(name);
        personAddresses.remove(name);
    }

    public List<String> listFilter(String filter) {
        List<String> filtered = new ArrayList<>();
        for (String name : personPhoneNumbers.keySet()) {
            if (name.contains(filter)) {
                filtered.add(name);
            }
        }

        for (String name : personAddresses.keySet()) {
            List<String> addresses = personAddresses.get(name);
                if (name.contains(filter) && !filtered.contains(name)) {
                    filtered.add(name);
                }
                for (String address : addresses) {
                    if (address.contains(filter) && !filtered.contains(name)) {
                        filtered.add(name);
                    }
                }

        }

        return filtered;
    }
}
