public class User {
    private String login;
    private String password;
    private long phoneNumber;




    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(Registration registration) {

    }

    @Override
    public String toString() {
        return "User login=" + login +
                ", User password=" + password;
    }

    public User registration() {

        return new User(new Registration());
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
