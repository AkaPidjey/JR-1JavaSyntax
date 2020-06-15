package Level_2;

/**
 * Title - Минимум двух чисел Ӏ Java Syntax: 2 уровень, 8 лекция 7 # 0214.
 * @task Написать функцию, которая возвращает минимум из двух чисел.
 *
 * Подсказка:
 * Нужно написать тело существующей функции min.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Метод min не должен выводить текст на экран.
 * •	Метод main должен вызвать метод min три раза.
 * •	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
 * •	Метод min должен возвращать минимальное значение из чисел a и b.
 */

public class Task_0214 {
    public static int min(int a, int b) {
        if (a < b) {
            return  a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
