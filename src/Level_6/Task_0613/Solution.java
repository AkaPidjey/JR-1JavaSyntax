package Level_6.Task_0613;

/**
 * Title - Кот и статика # 0613.
 * @task В классе Cat создай статическую переменную public int catCount.
 * Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
 * статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
 *
 * Требования:
 * •	В классе Cat создай статическую переменную public int catCount.
 * •	В классе Cat создай конструктор public Cat() без параметров.
 * •	Конструктор должен увеличивать значение статической переменной catCount на 1.
 * •	В методе main создай 10 котов.
 * •	В методе main, после создания всех котов, выведи значение переменной catCount.
 */

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount;
        public Cat() {
            catCount++;
        }
    }
}
