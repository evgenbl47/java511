import java.util.List;

public interface OutputService {
    void print(String message);
    void printLine(String message);
    void printContact(Contact contact);
    void printContacts(List<Contact> contacts);
}
