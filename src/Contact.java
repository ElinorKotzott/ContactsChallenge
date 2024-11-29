import java.util.Objects;

public class Contact {
    private String phoneNumber;
    private String name;

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Nummer: " + phoneNumber;
    }
}
