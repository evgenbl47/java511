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

class Book {
    String title = "unknown";
    String autor = "unknown";
    int year = 0;
    int pages = 0;

    public Book(){

    }

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public Book(String title, String autor, int year, int pages) {
        this(title, autor);
        this.year = year;
        this.pages = pages;
    }

    public String print() {
        return "Book [" +
                "title :" + title +
                ", autor :" + autor +
                ", year :" + year +
                ", pages :" + pages +
                ']';
    }

    public boolean isOld() {
        int currentYear = 2025;
        if (year > currentYear) {
            year = currentYear;
        }

        if ((currentYear - year) >= 50) {
            return true;
        }
        return false;
    }
}

class Product {
    String name;
    double price;
    int quantity;  //amount
    String category;

    //to do
    Product(){
        this.name = "unknown";
        this.category = "no category";
        this.price = 0.0;
        this.quantity = 0;

    }

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        double result;
        result = price * quantity;
        return result;
    }

    public void sell(int amount) {
        if (quantity == 0) {
            System.out.println("Nothing for selling");
            return;
        }
        if (quantity >= amount) {
            quantity -= amount;
            System.out.println("Sell amount: " + amount);
        } else {
            int res;
            res = quantity%amount;
            System.out.println("We sell only :" + res + ", you need :" + (amount - res));
            quantity -= res;
        }
    }

    public String printProduct() {
        return "Product [" +
                "name :" + name +
                ", price :" + price +
                ", quantity :" + quantity +
                ", category :" + category +
                "]";
    }

    public void restock(int amount) {
        if (amount < 0) {
            System.out.println("Negative arg");
            return;
        }
        quantity += amount;
        System.out.println(this.name + " restock +"+ amount + ", quantity :" + quantity);
    }
}


public class Main {

    public static void main(String[] args) {


        //Задание 1: Класс "Книга" (Book)
//Что нужно сделать:
//Создайте класс Book с полями: title (название), author (автор), year (год издания), pages (количество страниц)
//Создайте 3 конструктора: без параметров, с 2 параметрами (title, author), с всеми параметрами
//Создайте метод print() для вывода информации о книге
//Создайте метод isOld() который возвращает true если книга издана более 50 лет назад
//В main создайте 3 разные книги и выведите их информацию
//
//        Book[] books = new Book[3];
//        books[0] = new Book("BookOne", "Brain");
//        books[1] = new Book("BookTwo", "Pinkey", 1923, 20);
//        books[2] = new Book("BookThree", "Pinkey", 2012, 20);
//
//        for (Book book : books) {
//            System.out.println(book.print());
////            System.out.println("Book is old? :" + book.isOld());
//
//        }


        //Задание 2: Класс "Товар" (Product)
//Что нужно сделать:
//Создайте класс Product с полями: name (название), price (цена), quantity (количество на складе), category (категория)
//Создайте конструкторы с делегированием (минимум 3 конструктора)
//Создайте метод getTotalPrice() который возвращает общую стоимость (цена * количество)
//Создайте метод sell(int amount) который уменьшает количество товара
//Создайте метод restock(int amount) который увеличивает количество товара
//В main создайте магазин с 5 товарами и проведите несколько операций продажи
//
        Product auto = new Product("Car", 12);
        Product moto = new Product();
        Product bike = new Product();
        Product tram = new Product();
        Product plane = new Product();
        System.out.println(auto.printProduct());
        auto.sell(10);
        System.out.println(auto.printProduct());
        auto.sell(40);
        auto.restock(40);
        auto.sell(30);
        System.out.println(auto.printProduct());


        //Задание 3: Класс "Банковская карта" (BankCard)
//Что нужно сделать:
//Создайте класс BankCard с полями: cardNumber (номер карты), ownerName (имя владельца), balance (баланс), expiryDate (срок действия)
//Создайте конструкторы с разным количеством параметров
//Создайте метод deposit(double amount) для пополнения
//Создайте метод withdraw(double amount) для снятия (проверяйте достаточно ли денег)
//Создайте метод transfer(BankCard recipient, double amount) для перевода денег на другую карту
//В main создайте 3 карты и проведите операции между ними




        //Задание 6: Класс "Телефон" (Phone)
//Что нужно сделать:
//Создайте класс Phone с полями: brand, model, price, batteryLevel (уровень батареи), isOn (включен ли)
//Создайте конструкторы (минимум 3 варианта)
//Создайте методы: turnOn(), turnOff(), charge(int minut), use(int hours) (использование уменьшает батарею)
//Создайте метод getInfo() возвращающий строку с информацией о телефоне
//В main создайте массив из 4 телефонов и симулируйте день использования
//
//        Phone[] phones = new Phone[4];
//
//        for (int i = 0; i < 4; i++) {
//            phones[i] = new Phone("" + i, "" + i, 19.99, 10, false);
//        }
//
//        for (int i = 0; i < phones.length; i++) {
//            System.out.println(phones[i].getInfo());
//            phones[i].charge(15);phones[i].turnOn();
//            System.out.println(phones[i].getInfo());
//            phones[i].use(50);
//            System.out.println(phones[i].getInfo());
//        }
//
       }
}






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
