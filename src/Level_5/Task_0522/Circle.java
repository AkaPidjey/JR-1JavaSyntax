package Level_5.Task_0522;

/**
 * Title - Максимум конструкторов # 0522.
 * @task Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.
 *
 * Подсказка:
 * не забудь про конструктор по умолчанию.
 *
 * Требования:
 * •	У класса должно быть хотя бы три переменные.
 * •	У класса должен быть конструктор по умолчанию.
 * •	У класса должен быть хотя бы один конструктор.
 * •	У класса должно быть хотя бы два конструктора.
 * •	У класса должно быть хотя бы три конструктора.
 * •	У класса должно быть хотя бы четыре конструктора.
 */

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {}

    public Circle(double y) {
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
    }
}
