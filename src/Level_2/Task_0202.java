package Level_2;

/**
 * Title - Откуда берутся Person? # 0202.
 * @task В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
 * В методе main создай объект Person, занеси его ссылку в переменную person.
 *
 * Подсказка: для создания объекта Person и занесения его ссылки в переменную person используй конструкцию:
 * ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
 *
 * Требования:
 * •	В классе Person объяви переменную name типа String.
 * •	В классе Person объяви переменную age типа int.
 * •	В классе Person объяви переменную weight типа int.
 * •	В классе Person объяви переменную money типа int.
 * •	В методе main создай объект Person и сразу присвой ссылку на него переменной person.
 * •	Должно быть объявлено 5 переменных.
 */

public class Task_0202 {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }
}
