package phonebook.domain;

public class PersonPhoneNumbers {
    private String name;
    private String phoneNumber;

    public PersonPhoneNumbers(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

