package Level_5.Task_0504;

/**
 * Title - Трикотаж # 0504.
 * @task Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать
 * котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне.
 * Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Нужно создать три объекта типа Cat.
 * •	Класс Cat нельзя изменять.
 * •	Программа не должна выводить данные на экран.
 */

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("vaska", 10, 10,10 );
        Cat cat2 = new Cat("petka", 11, 11,11 );
        Cat cat3 = new Cat("barsik", 12, 12,12 );
    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
