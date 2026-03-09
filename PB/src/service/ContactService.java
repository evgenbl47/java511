package service;

import model.Contact;
import repository.FileManager;

import java.util.ArrayList;
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

//    Алгоритм:
//    Загрузить все контакты через fileManager.loadContacts(userName).
//    Найти контакт с нужным contactId (используй Stream API или цикл).
//    Если контакт найден — обнови его поля через сеттеры (setName, setAge, и т.д.), используя данные из updatedData.
//    Если контакт не найден — вернуть false.
//    Вызови fileManager.saveAllContacts(contacts, userName) для сохранения изменений.
//    Вернуть true при успехе.
    public boolean editContact(String userName, int contactId, Contact updatedContact) {

        List<Contact> contacts = fileManager.loadContacts(userName);
        for (Contact contact : contacts) {
            if (contact.getId() == contactId) {
                // ID;Имя;Фамилия;Возраст;Пол;Email;phone1|phone2
                contact.setName(updatedContact.getName());
                contact.setSurname(updatedContact.getSurname());
                contact.setAge(updatedContact.getAge());
                contact.setGender(updatedContact.getGender());
                contact.setEmail(updatedContact.getEmail());
                contact.setPhoneNumbers(updatedContact.getPhoneNumber());

                fileManager.saveAllContacts(contacts, userName);
                return true;
            }
        }
        return false;
    }

}
