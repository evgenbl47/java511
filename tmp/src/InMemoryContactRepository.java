import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryContactRepository implements ContactRepository{
    private final List<Contact> contacts = new ArrayList<>();

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public List<Contact> findAll() {
        return new ArrayList<>(contacts); // защитное копирование
    }


    @Override
    public Optional<Contact> findById(int id) {
        if (id >= 0 && id < contacts.size()) {
            return Optional.of(contacts.get(id));
        }
        return Optional.empty();
    }

    @Override
    public void update(int id, Contact contact) {
        if (id >= 0 && id < contacts.size()) {
            contacts.set(id, contact);
        }
    }

    @Override
    public void delete(int id) {
        if (id >= 0 && id < contacts.size()) {
            contacts.remove(id);
        }
    }

    @Override
    public List<Contact> search(String query) {
        String lowerQuery = query.toLowerCase();
        return contacts.stream()
                .filter(c -> c.getName().toLowerCase().contains(lowerQuery) ||
                        c.getPhoneNumber().contains(lowerQuery))
                .collect(Collectors.toList());
    }
}
