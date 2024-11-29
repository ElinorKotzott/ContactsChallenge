import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    public ArrayList<Contact> myContacts;
    private final String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) >= 0) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String number) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (Objects.equals(myContacts.get(i).getPhoneNumber(), number)) {
                return myContacts.indexOf(myContacts.get(i));
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact myContact : myContacts) {
            if (Objects.equals(myContact.getName(), name)) {
                return myContact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}



