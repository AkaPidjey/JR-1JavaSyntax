package Level_1;

/**
 * Title - Число в квадрате # 0127
 * @task Напиши программу, которая выводит на экран квадрат числа 5.
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Метод main должен вызывать метод sqr с параметром 5.
 * •	Метод main должен выводить результат метода sqr.
 * •	Метод sqr изменять нельзя.
 * •	Выводимый текст должен соответствовать заданию.
 */

public class Task_0127 {
    public static void main(String[] args) {
        System.out.println(sqr(5));
    }

    public static int sqr(int a) {
        return a * a;
    }
}
