package Level_6.Task_0602;

/**
 * Title - Пустые кошки, пустые псы # 0602.
 * @task В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том,
 * что такой-то объект уничтожен.
 *
 * Требования:
 * •	В классе Cat должен быть void метод finalize.
 * •	В классе Dog должен быть void метод finalize.
 * •	В классах Cat и Dog не должно быть конструкторов или должны быть конструкторы без параметров.
 * •	Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
 * •	Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
 */

public class Cat {
    public static void main(String[] args) {
    }

    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }

    class Dog {
        protected void finalize() throws Throwable {
            System.out.println("A Dog was destroyed");
        }
    }
}