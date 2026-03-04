package repository;

import model.User;

import java.io.*;
import java.util.ArrayList;
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
}
