import java.util.List;
import java.util.Optional;

public interface ContactRepository {
    void add(Contact contact);
    List<Contact> findAll();
    Optional<Contact> findById(int id);
    void update(int id, Contact contact);
    void delete(int id);
    List<Contact> search(String query);
}
