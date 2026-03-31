package model;

public class User {
    private String firstName;
    private String lastName;
    private String login;
    private String password;

    public User(String login, String password, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format("User [firstName: %s, lastName: %s, username: %s, password: %s", firstName, lastName, login, password);
    }
}
