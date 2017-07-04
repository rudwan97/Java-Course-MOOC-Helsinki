package phonebook.domain;

public class PersonAddresses {
    private String name;
    private String address;

    public PersonAddresses(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}


