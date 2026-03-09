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

    private Contact(int id, String name, String surname, int age, Gender gender, String email, List<String> phoneNumbers) {
       this.phoneNumbers = phoneNumbers;
        this.id = id;
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    public static Contact createNew(String name, String surname, int age, Gender gender, String email, List<String> phoneNumbers) {
        return new Contact(idCounter++, name, surname, age, gender, email, phoneNumbers);
    }

    public static Contact fromFile(int id, String name, String surname, int age, Gender gender, String email, List<String> phoneNumbers) {
        if (id >= idCounter) {
            idCounter = id + 1;
        }
        return new Contact(id, name, surname, age, gender, email, phoneNumbers);
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
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
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
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return String.format("Contact[ ID: %d, name: %s, surname: %s, age: %d, e-mail: %s, phoneNumber: %s ]",id, name, surname, age, email, phoneNumbers);
    }
}
