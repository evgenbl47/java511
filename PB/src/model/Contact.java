package model;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    List<String> phoneNumbers = new ArrayList<>();
    private int id;
    private String name;
    private int age;
    private String surname;
    private String email;
    private Gender gender;
    private static int idCounter = 1;


    public Contact(String name, String surname, int age, Gender gender, String email, List<String> phoneNumbers) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumbers = phoneNumbers; // Теперь данные из параметров попадают в объект
    }

    public int getId() {
        return id;
    }
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
    public List<String> getPhoneNumber() {
        return phoneNumbers;
    }
    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("Contact[ID: %d, name: %s, surname %s, age: %d, e-mail: %s, phoneNumber: %s",id, name, surname, age, email, phoneNumbers);
    }
}
