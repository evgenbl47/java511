import game.Direction;
import game.Player;

public class Main {
    public static void main(String[] args) {

        //Задание 1: Базовые дни недели
        //Создай enum DayOfWeek, представляющий дни недели (MONDAY, TUESDAY, ..., SUNDAY).
        //Напиши метод isWeekend(), который возвращает true, если день является субботой или воскресеньем.
        DayOfWeak today = DayOfWeak.SUNDAY;
        if (today.isWeekend()) {
            System.out.println("Today is WEEKEND");
        } else {
            System.out.println("Today is WORK_DAY");
        }

        //Задание 2: Простой калькулятор операций
        //Создай enum Operation с элементами ADD, SUBTRACT, MULTIPLY, DIVIDE.
        //Добавь в него метод apply(double a, double b), который выполняет соответствующую арифметическую операцию над двумя числами и возвращает результат.
        Operation operation = Operation.MULTIPLY;
        System.out.println("Operation :" + operation.name() + " returned :" + operation.apply(5, 5));

        //Задание 3: Статус заказа
        //Создай enum OrderStatus со значениями: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
        //Напиши метод isCompleted(), который возвращает true, если статус заказа является конечным (т.е. DELIVERED или CANCELLED).
        OrderStatus orderStatus = OrderStatus.NEW;
        System.out.println("Order status :" + (orderStatus.isCompleted() ? "DELIVERED" : "IN PROCESS"));

        //Задание 4: Цвета светофора
        //Создай enum TrafficLight с элементами RED, YELLOW, GREEN.
        //Реализуй метод getNext(), который возвращает следующий цвет светофора в стандартной последовательности: RED → GREEN → YELLOW → RED и так далее.
        TrafficLight trafficLight = TrafficLight.RED;
        System.out.println("Current color of taffic light is :" + trafficLight.name() +
                                            ", next color is :" + trafficLight.getNext());

        //Задание 5: Планеты и их масса
        //Создай enum Planet с несколькими планетами (например, MERCURY, VENUS, EARTH).
        //Добавь в него поле mass (масса) и конструктор для его инициализации.
        //Напиши метод getMass(), возвращающий массу планеты.
        Planet planet = Planet.EARTH;
        System.out.println("Planet :" + planet.name() + ", mass :" + planet.getMass());
    }

}




