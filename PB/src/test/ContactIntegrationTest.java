package test;

import model.Contact;
import model.Gender;
import repository.FileManager;
import service.ContactService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//        (String name, String surname, int age, Gender gender, String email, List<String> phoneNumbers)
public class ContactIntegrationTest {
    public static void testEditContact() {
        //deleteTestFile//
        File testFile = new File("PB/src/tmp/data/testUser.txt");
        if (testFile.exists()) {
            testFile.delete();
            System.out.println("🗑️ Test file removed");
        }

        List<String> phones = new ArrayList<>();
        phones.add("+12345678");
        phones.add("+87654321");

        Contact originalContact = Contact.createNew("Tom", "Smith", 12, Gender.MALE, "tomsmith@email.ucoz", phones);

        FileManager fileManager = new FileManager();
        fileManager.saveContact(originalContact, "testUser");

        List<Contact> before = fileManager.loadContacts("testUser");
        boolean isNameOriginal = before.get(0).getName().equals("Tom");
        System.out.println("Is name origin ? " +isNameOriginal);

        ContactService service = new ContactService(fileManager);
        Contact updatedContact = Contact.createNew("Tommy", "Vercetty", 32, Gender.MALE, "tommyvercetty@global.com", phones);
        boolean isEditApplied = service.editContact("testUser", 1, updatedContact);
        System.out.println("Is name changed ? " + isEditApplied);

        List<Contact> after = fileManager.loadContacts("testUser");
        boolean isSizeOne = after.size() == 1;
        System.out.println("Size == 1 ? " + isSizeOne);
        boolean isNameChange = after.get(0).getName().equals("Tommy");
        System.out.println("Changes applied ? " + isNameChange);

    }

    public static void testSaveLoadCycle() {

    }

    public static void main(String[] args) {
        System.out.println("🧪 Запуск тестов контактов...");
        testSaveLoadCycle();
        testEditContact();
        System.out.println("✅ Тесты завершены");
    }
}
