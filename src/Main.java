import java.util.*;

public class Main {
    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone("000");
        myPhone.addNewContact(new Contact("34345", "John"));
        System.out.println(myPhone.myContacts.get(0).getName() + myPhone.myContacts.get(0).getPhoneNumber());
        if (myPhone.updateContact(myPhone.myContacts.get(0), new Contact("2234", "Brian"))) {
            System.out.println(myPhone.myContacts.get(0).getName());
        }
        if (myPhone.removeContact(new Contact("345", "Sophie"))) {
            System.out.println("Contact has been removed!");
        } else {
            System.out.println("Contact not found!");
        }
        if (myPhone.removeContact(myPhone.myContacts.get(0))) {
            System.out.println("Contact has been removed!");
        }
        myPhone.addNewContact(new Contact("22", "Dudi"));
        myPhone.addNewContact(new Contact("33", "Peter"));
        myPhone.addNewContact(new Contact("44", "Pan"));
        myPhone.addNewContact(new Contact("55", "Dideldum"));

        for (int i = 0; i < myPhone.myContacts.size(); i++) {
            System.out.println(myPhone.myContacts.get(i).getPhoneNumber() + ": " + myPhone.myContacts.get(i).getName());
        }

        System.out.println(myPhone.findContact("22"));
        System.out.println(myPhone.findContact("23"));
        System.out.println(myPhone.findContact("44"));

        System.out.println(myPhone.queryContact("Ben"));
        System.out.println(myPhone.queryContact("Dudi"));
        System.out.println(myPhone.queryContact("Dideldum"));

        myPhone.printContacts();
    }

}