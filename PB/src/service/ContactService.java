package service;

import model.Contact;
import repository.FileManager;

import java.util.List;

public class ContactService {
    private final FileManager fileManager;


    public ContactService(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public void addContact(Contact contact, String userName) {
        fileManager.saveContact(contact, userName);

    }

    public List<Contact> getContacts(String userName) {
        List<Contact> contacts = fileManager.loadContacts(userName);
        return contacts;
    }

}
