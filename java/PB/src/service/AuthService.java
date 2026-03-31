package service;

import model.User;
import repository.FileManager;

import java.util.List;
import java.util.Optional;

public class AuthService {
    private final FileManager fileManager;

    public AuthService(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public User login(String login, String password) {
        List<User> users = fileManager.loadUsers();
        Optional<User> foundUser = users.stream()
                .filter(u -> u.getLogin().equals(login) && u.getPassword().equals(password))
                .findFirst();

        if (foundUser.isPresent()) {
            return foundUser.get();
        }else {
            return null;
        }
    }

    public boolean register(String login, String password, String firstName, String lastName) {
        List<User> users = fileManager.loadUsers();

        boolean isTaken = users.stream().anyMatch(u -> u.getLogin().equals(login));
        if (isTaken) {
            return false;
        } else {
            User user = new User(login, password, firstName, lastName);
            fileManager.saveUser(user);
            return true;
        }
    }
}
