package Level_2;

/**
 * Title - Макс, Белла и Джек # 0209.
 * @task Создать 3 объекта типа Dog (собака).
 * Сохрани каждый экземпляр в отдельную переменную.
 * Присвоить им имена "Max", "Bella", "Jack".
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	В методе main должно быть только три переменные типа Dog.
 * •	Переменным сразу должны быть присвоены значения.
 * •	Каждому объекту типа Dog должно быть присвоено имя.
 * •	В классе Dog должна быть одна переменная name.
 * •	В классе Dog не должно быть методов.
 */


public class Task_0209 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";

    }

    public static class Dog {
        public String name;
    }
}
