package Level_1;

/**
 * Title - Просто, как 2+2 # 0128
 * @task Напиши программу, которая вызывает метод sum с параметрами 2 и 2.
 *
 * Требования:
 * •	Программа должна выводить сумму 2 и 2.
 * •	Метод main должен вызывать метод sum с параметрами 2 и 2.
 * •	Метод main не должен вызывать команду вывода текста на экран.
 * •	Метод sum изменять нельзя.
 */

public class Task_0128 {
    public static void main(String[] args) {
        sum(2, 2);
    }

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}
