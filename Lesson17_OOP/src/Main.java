//20251127_194441
//Start OOP

class Phone {
    String brand;
    String model;
    double price;
    int batteryLevel;
    boolean isOn;

    public Phone(String brand, String model, double price, int batteryLevel, boolean isOn) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryLevel = batteryLevel;
        this.isOn = isOn;
    }

    public void turnOn() {
        if (batteryLevel == 0) {
            System.out.println("No battery");
        }
        if (batteryLevel > 1) {
            isOn = true;
            batteryLevel--;
        }
    }

    public void turnOf() {
        isOn = false;
    }

    public void charge(int  minutes) {
        if (0 < minutes) {
            int charge;
            charge = batteryLevel + (minutes * 2);
            if (charge <= 100) {
                batteryLevel += charge;
            } else batteryLevel = 100;
        }
    }

    public void use(int minutes) {
        if (0 < minutes) {
            int use;
            use = batteryLevel - (minutes * 2);
            if (use > 0) {
                batteryLevel = batteryLevel - (minutes * 2);
            } else {
                batteryLevel = 0;
                turnOf();
            }
        }
    }

    public String getInfo() {
        return "Phone [" +
                "brand: " + brand +
                ", model: " + model +
                //", price: " + price +
                ", batteryLevel: " + batteryLevel +
                ", isOn: " + isOn +
                "]";
    }

}


public class Main {

    public static void main(String[] args) {

        Phone[] phones = new Phone[4];

        for (int i = 0; i < 4; i++) {
            phones[i] = new Phone("" + i, "" + i, 19.99, 10, false);
        }

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getInfo());
            phones[i].charge(15);phones[i].turnOn();
            System.out.println(phones[i].getInfo());
            phones[i].use(50);
            System.out.println(phones[i].getInfo());
        }

       }
}



//Задание 1: Класс "Книга" (Book)
//Что нужно сделать:
//Создайте класс Book с полями: title (название), author (автор), year (год издания), pages (количество страниц)
//Создайте 3 конструктора: без параметров, с 2 параметрами (title, author), с всеми параметрами
//Создайте метод print() для вывода информации о книге
//Создайте метод isOld() который возвращает true если книга издана более 50 лет назад
//В main создайте 3 разные книги и выведите их информацию
//Задание 2: Класс "Товар" (Product)
//Что нужно сделать:
//
//Создайте класс Product с полями: name (название), price (цена), quantity (количество на складе), category (категория)
//Создайте конструкторы с делегированием (минимум 3 конструктора)
//Создайте метод getTotalPrice() который возвращает общую стоимость (цена * количество)
//Создайте метод sell(int amount) который уменьшает количество товара
//Создайте метод restock(int amount) который увеличивает количество товара
//В main создайте магазин с 5 товарами и проведите несколько операций продажи
//Задание 3: Класс "Банковская карта" (BankCard)
//Что нужно сделать:
//
//Создайте класс BankCard с полями: cardNumber (номер карты), ownerName (имя владельца), balance (баланс), expiryDate (срок действия)
//Создайте конструкторы с разным количеством параметров
//Создайте метод deposit(double amount) для пополнения
//Создайте метод withdraw(double amount) для снятия (проверяйте достаточно ли денег)
//Создайте метод transfer(BankCard recipient, double amount) для перевода денег на другую карту
//В main создайте 3 карты и проведите операции между ними
//Задание 4: Класс "Прямоугольник" (Rectangle)
//Что нужно сделать:
//
//Создайте класс Rectangle с полями: width (ширина), height (высота), color (цвет)
//Создайте конструктор для квадрата (один параметр - сторона)
//Создайте конструктор для прямоугольника без цвета
//Создайте конструктор со всеми параметрами
//Создайте методы: getArea(), getPerimeter(), isSquare()
//В main создайте массив из 5 фигур (квадраты и прямоугольники) и найдите фигуру с максимальной площадью
//Задание 5: Класс "Сотрудник" (Employee)
//Что нужно сделать:
//
//Создайте класс Employee с полями: name, position (должность), salary, experience (стаж в годах), department (отдел)
//Создайте несколько конструкторов с делегированием
//Создайте метод giveRaise(double percent) для повышения зарплаты
//Создайте метод promote(String newPosition) для повышения должности
//Создайте метод celebrateAnniversary() который увеличивает стаж на 1 год
//В main создайте отдел из 7 сотрудников и найдите сотрудника с максимальной зарплатой

//Задание 6: Класс "Телефон" (Phone)
//Что нужно сделать:
//Создайте класс Phone с полями: brand, model, price, batteryLevel (уровень батареи), isOn (включен ли)
//Создайте конструкторы (минимум 3 варианта)
//Создайте методы: turnOn(), turnOff(), charge(int minut), use(int hours) (использование уменьшает батарею)
//Создайте метод getInfo() возвращающий строку с информацией о телефоне
//В main создайте массив из 4 телефонов и симулируйте день использования
