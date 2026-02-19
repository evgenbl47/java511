package tmp;

public class Contact {
    private int id;
    private String name;
    private int age;
    private String surname;
    private String email;
    private String phoneNumber;

    public Contact(int id, int age, String name, String surname, String email, String phoneNumber) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id){this.id = id;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Contact[ID: %d, age: %d, name: %s, surname %s, e-mail: %s, phoneNumber: %s",id, age, name, surname, email, phoneNumber);
    }
}
