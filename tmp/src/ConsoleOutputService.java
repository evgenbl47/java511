import java.util.List;

public class ConsoleOutputService implements OutputService{
    @Override
    public void print(String message) {
        System.out.print(message);
    }

    @Override
    public void printLine(String message) {
        System.out.println(message);
    }

    @Override
    public void printContact(Contact contact) {
        System.out.println(contact);
    }

    @Override
    public void printContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("Список контактов пуст.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }
}
