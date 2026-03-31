package repository;

import model.Contact;
import model.Gender;
import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {

    private String path = "PB/src/tmp/data/users.txt";

    {
        File file = new File(path);
        File parentDir = file.getParentFile(); // Получаем путь до папки (без имени файла)

        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs(); // Создает ВСЕ недостающие папки в пути
        }
    }

    public void saveUser(User user) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path, true))) {
            String result = String.format("%s;%s;%s;%s",
                    user.getLogin(),
                    user.getPassword(),
                    user.getFirstName(),
                    user.getLastName());
            writer.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> loadUsers() {
        File file = new File(path);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length < 4) {
                    continue;
                }
                String login = parts[0];
                String password = parts[1];
                String name = parts[2];
                String surname = parts[3];

                User loadedUser = new User(login, password, name, surname);
                users.add(loadedUser);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    // ID;Имя;Фамилия;Возраст;Пол;Email;phone1|phone2
    public void saveContact(Contact contact, String userName) {
        String path = "PB/src/tmp/data/" + userName + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(path, true))) {
            String phones = String.join("|", contact.getPhoneNumber());
            String result = String.format("%d;%s;%s;%d;%s;%s;%s",
                    contact.getId(),
                    contact.getName(),
                    contact.getSurname(),
                    contact.getAge(),
                    contact.getGender(),
                    contact.getEmail(),
                    phones);
            writer.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Contact> loadContacts(String userName) {
        String path = "PB/src/tmp/data/" + userName + ".txt";
        List<Contact> contacts = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while (true) {
                if ((line = bufferedReader.readLine()) == null) break;
                String[] parts = line.split(";");
                // number;ID;Имя;Фамилия;Возраст;Пол;Email;phone1|phone2
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                String surname = parts[2].trim();
                int age = Integer.parseInt(parts[3].trim());
                Gender gender = Gender.valueOf(parts[4].trim());
                String email = parts[5].trim();
                List<String> phoneNumbers = Arrays.asList(parts[6].split("\\|"));
                Contact contact = Contact.fromFile(id, name, surname, age, gender, email, phoneNumbers);
                contacts.add(contact);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return contacts;
    }

    public void saveAllContacts(List<Contact> contacts, String userName) {
        String path = "PB/src/tmp/data/" + userName + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(path, false))) {
            for (Contact contact : contacts) {
                String phones = String.join("|", contact.getPhoneNumber());
                String result = String.format("%d;%s;%s;%d;%s;%s;%s",
                        contact.getId(),
                        contact.getName(),
                        contact.getSurname(),
                        contact.getAge(),
                        contact.getGender(),
                        contact.getEmail(),
                        phones);
                writer.println(result);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
