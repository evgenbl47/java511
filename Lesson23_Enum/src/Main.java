import game.Direction;
import game.Player;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Tom");
        System.out.println(player);

        System.out.println(player);
        player.setDirection(Direction.UP);
        player.move();
        player.move();
        player.setDirection(Direction.RIGHT);
        player.move();
        System.out.println(player);
    }

}

//Задание 1: Базовые дни недели
//Создай enum DayOfWeek, представляющий дни недели (MONDAY, TUESDAY, ..., SUNDAY).
//Напиши метод isWeekend(), который возвращает true, если день является субботой или воскресеньем.
//Задание 2: Простой калькулятор операций
//Создай enum Operation с элементами ADD, SUBTRACT, MULTIPLY, DIVIDE.
//Добавь в него метод apply(double a, double b), который выполняет соответствующую арифметическую операцию над двумя числами и возвращает результат.
//Задание 3: Статус заказа
//Создай enum OrderStatus со значениями: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
//Напиши метод isCompleted(), который возвращает true, если статус заказа является конечным (т.е. DELIVERED или CANCELLED).
//Задание 4: Цвета светофора
//Создай enum TrafficLight с элементами RED, YELLOW, GREEN.
//Реализуй метод getNext(), который возвращает следующий цвет светофора в стандартной последовательности: RED → GREEN → YELLOW → RED и так далее.
//Задание 5: Планеты и их масса
//Создай enum Planet с несколькими планетами (например, MERCURY, VENUS, EARTH).
//Добавь в него поле mass (масса) и конструктор для его инициализации.
//Напиши метод getMass(), возвращающий массу планеты.