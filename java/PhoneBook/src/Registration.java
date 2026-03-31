public class Registration {
    User user;
    String name;
    String password;

    public Registration() {
        reg();
    }

    public User reg() {
        this.user = new User(name, password);
        //todo return user
        return new User("login", "password");
    }
}
