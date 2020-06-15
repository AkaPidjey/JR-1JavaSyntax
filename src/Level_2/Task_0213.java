package Level_2;

/**
 * Title - Питомцам нужны люди # 0213.
 * @task Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
 * Присвой каждому животному владельца (owner).
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	В методе main создай объекты типа Cat, Dog, Fish, Woman занеси их ссылки в переменные.
 * •	В методе main присвойте каждому животному владельца Woman.
 * •	Класс Cat, Dog, Fish должен содержать только одну переменную Woman owner.
 * •	Класс Woman не должен содержать переменных.
 */

public class Task_0213 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
