package Level_4.Task_0407;

/**
 * Title - Кошки во Вселенной # 0407.
 * @task Написать код, чтобы правильно считалось количество созданных котов (count) и на экран
 * выдавалось правильное их количество.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Нельзя изменять строку отвечающую за вывод в консоль.
 * •	Класс Cat должен содержать только одну переменную count.
 * •	Переменная count класса Cat должна быть статической, иметь модификатор доступа public, тип int и
 * проинициализирована нулем.
 * •	В методе main должно быть только две проинициализированные переменные типа Cat.
 * •	Переменная count должна содержать актуальное количество созданных объектов-котов.
 */


public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count = Cat.count + 1;
        Cat cat2 = new Cat();
        Cat.count = Cat.count + 1;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
