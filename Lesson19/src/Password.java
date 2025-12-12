public class Password {
    private String password;

    private boolean isCorrect(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Passwords length incorrect");
            return false;
        }
        return true;
    }

    public void setPassword(String password) {
        if (!isCorrect(password)) {
            return;
        }
        this.password = password;
        System.out.println("Password is setup");
    }

    public void checkPassword(String password) {
        if (!isCorrect(password)) {
            return;
        }
        if (this.password.equals(password)) {
            System.out.println("Passwords are the same");
            return;
        }
        System.out.println("Passwords are different");
        return;
    }
}
