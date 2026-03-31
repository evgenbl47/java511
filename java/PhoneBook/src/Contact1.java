public class Contact1 {
    static int contactCounter;
    int id;
    String name;
    String surname;
    long phoneNumber;
    int age;

    public Contact1(String name, String surname, long phoneNumber, int age) {
        this.id = contactCounter;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        contactCounter++;
    }

    @Override
    public String toString() {
        return "Contact id: " + id + "[" +
                "name: "  + name +
                ", surname: " + surname +
                ", phoneNumber: " + phoneNumber +
                ", age :" + age +
                ']';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//2. Структура контакта:
//Каждый контакт должен содержать:
//Уникальный ID (генерируется автоматически)
//Имя
//Фамилия
//Номер телефона
//Возраст