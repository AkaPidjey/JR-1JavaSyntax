package Level_5.Task_0524;

/**
 * Title - Основа колеса # 0524.
 * @task В классе Circle создать конструктор который проинициализирует все переменные класса.
 * В конструкторе должно быть три аргумента.
 *
 * Требования:
 * •	У класса Circle должны быть переменные x, y и r с типом double.
 * •	У класса должен быть один конструктор.
 * •	Конструктор должен быть public.
 * •	Конструктор должен иметь три параметра типа double.
 * •	Конструктор должен проинициализировать все переменные класса.
 */

public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public static void main(String[] args) {
    }
}
