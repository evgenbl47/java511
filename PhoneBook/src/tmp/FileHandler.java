package tmp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//todo FileWriter check if directory is not create than create it;
public class FileHandler {
    private String path = "PhoneBook/src/tmp/data/";
    private String fileName = "TEST";
    private String dir = path + fileName + ".txt";

    public void saveToFile(List<Contact> contacts) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dir))){
            for (Contact contact : contacts) {
                String res = String.format("%d|%d|%s|%s|%s|%s",
                        contact.getId(),
                        contact.getAge(),
                        contact.getName(),
                        contact.getSurname(),
                        contact.getEmail(),
                        contact.getPhoneNumber() );
                writer.println(res);

            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.toString());
        }

    }

    public List<Contact> loadFromFile() {
        List<Contact> tmpContact = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(dir))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split("\\|");
                int id = Integer.parseInt(s[0]);
                int age = Integer.parseInt(s[1]);
                String name = s[2];
                String surname = s[3];
                String email = s[4];
                String phoneNumber = s[5];
                Contact contact = new Contact(id, age, name, surname, email, phoneNumber);
                tmpContact.add(contact);

                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.toString());
        }
        return tmpContact;
    }
}
