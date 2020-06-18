package Level_4.Task_0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Три числа # 0424.
 * @task Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 *
 * Пример для чисел 4 6 6:
 * 1
 *
 * Пример для чисел 6 6 3:
 * 3
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна использовать команды System.out.println() или System.out.print().
 * •	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * •	Если все числа разные, ничего не выводить.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        String vvod3 = reader.readLine();
        int ch1 = Integer.parseInt(vvod1);
        int ch2 = Integer.parseInt(vvod2);
        int ch3 = Integer.parseInt(vvod3);

        if (ch1 != ch2 & ch1 != ch3 & ch2 == ch3 )
            System.out.println("1");
        else if (ch2 != ch1 & ch2 != ch3 & ch1 == ch3)
            System.out.println("2");
        else if (ch3 != ch1 & ch3 != ch2 & ch1 == ch2)
            System.out.println("3");
    }
}
