package Level_5.Task_0525;

/**
 * Title - И целой утки мало # 0525.
 * @task По аналогии с классом Duck (утка) создай классы Cat (кошка) и Dog (собака).
 * Подумай, что должен возвращать метод toString в классах Cat и Dog?
 * В методе main создай по два объекта каждого класса и выведи их на экран.
 * Объекты класса Duck уже созданы и выводятся на экран.
 *
 * Требования:
 * •	Создай класс Cat(кошка).
 * •	Создай класс Dog(собака).
 * •	У класса Cat должен быть верно реализован метод toString.
 * •	У класса Dog должен быть верно реализован метод toString.
 * •	В методе main создай два объекта типа Cat.
 * •	В методе main создай два объекта типа Dog.
 * •	Выведи все созданные объекты на экран.
 */

public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}
