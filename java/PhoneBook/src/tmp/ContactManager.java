package tmp;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    Logger logger;
    private List<Contact> contacts = new ArrayList<>();
    private int id = 1;

    public void addContact(String name, String surname, int age, String email, String phoneNumber) {
        if (name == null || name.isBlank() || phoneNumber == null || phoneNumber.isBlank()) {
            System.out.println("Field name || phoneNumber isBlank)");
//            logger.log(String.format("-ERROR Contact[ID: %d, name: %s, phoneNumber: %s - name of phoneNumber requared",id , name, phoneNumber));
            return;
        }
        Contact contact = new Contact(id, age, name, surname, email, phoneNumber);
        contacts.add(contact);
        id +=1;
//        logger.log(String.format("-ADD Contact[ID: %d, age: %d, name: %s, surname %s, e-mail: %s, phoneNumber: %s - SUCCESS",id, age, name, surname, email, phoneNumber));
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    //todo filter uses StreamApi
    public void printAllContacts(){
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            contacts.forEach((x) -> System.out.println(x.toString()));
        }
    }
}
