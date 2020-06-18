package Level_4.Task_0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Положительное число # 0428.
 * @task Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
 *
 * Примеры:
 * а) при вводе чисел
 * -4
 * 6
 * 6
 * получим вывод
 * 2
 *
 * б) при вводе чисел
 * -6
 * -6
 * -3
 * получим вывод
 * 0
 * в) при вводе чисел
 * 0
 * 1
 * 2
 * получим вывод
 * 2
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить количество положительных чисел в исходном наборе.
 * •	Если положительных чисел нет, программа должна вывести "0".
 * •	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
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
        int it = 0;

        if (ch1 > 0) it = 1;
        else it = 0;
        if (ch2 > 0) it = it + 1;
        else it = it + 0;
        if (ch3 > 0) it = it + 1;
        else it = it + 0;
        System.out.println(it);
    }
}
