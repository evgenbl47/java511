public class Main {
    public static void main(String[] args) {
//1. ПриветствиеСоздай переменную с твоим именем и выведи: "Привет, [имя]!"
        String name = "Evgeny";
        System.out.printf("Hello %s!\n\n", name);

//2. Возраст через 5 летСоздай переменную age = 15, посчитай и выведи, сколько тебе будет через 5 лет.
        int age = 15;
        System.out.printf("After 5 years my age will be %d.\n\n", age + 5);

//3. Периметр прямоугольникаДаны стороны a = 5 и b = 8. Посчитай периметр (P = 2×(a+b)).
        int sideA = 5, sideB = 8;
        int rectanglePerimeter = 2 * (sideA + sideB);
        System.out.printf("Perimeter of rectangle equals %d.\n\n",rectanglePerimeter);

//4. Цена со скидкойЦена товара price = 1000, скидка discount = 15 (процентов). Посчитай финальную цену.
        double price = 1000f;
        double discount = 15f;
        double totalPrice = price - ((price * discount) / 100f);
        System.out.printf("Total price: %.2f.\n\n", totalPrice);

//5. Конвертер температурыДано celsius = 25. Переведи в Фаренгейты (F = C × 1.8 + 32).
        double tempC = 25f;
        double tempF = (tempC * 1.8f) + 32f;
        System.out.printf("Temperature in Farleigh %.2f\n\n", tempF);

//6. Среднее арифметическоеДаны три числа: a = 10, b = 20, c = 30. Найди их среднее.
        int a = 10, b = 20, c = 30;
        double average = (a + b + c) / 3f;
        System.out.printf("Arithmetic average: %.1f\n\n", average);

//7. Чётное или нечётноеСоздай переменную number = 7. Выведи остаток от деления на 2 (если 0 — чётное, если 1 — нечётное).
        int number = 7;
        double reminder = number %2;
        if (reminder == 0){
            System.out.print("Number 7 is even\n\n");
        }else {
            System.out.print("Number 7 is odd\n\n");
        }

//8. Обмен значенийДаны x = 5 и y = 10. Поменяй их значения местами (используй третью переменную).
        int x = 5, y = 10;
        int tmp;

        System.out.printf("X before:%d, Y before:%d\n", x, y);
        tmp = x;
        x = y;
        y = tmp;
        System.out.printf("X after:%d, Y after:%d\n\n", x, y);

//9. Форматированный выводВыведи
/*
Товар:     Яблоко
Цена:      50 руб
Количество: 3

Используй \t для выравнивания.
 */
        System.out.println("Товар:\t\tЯблоко");
        System.out.println("Цена:\t\t50 руб");
        System.out.println("Количество:\t3");

    }
}