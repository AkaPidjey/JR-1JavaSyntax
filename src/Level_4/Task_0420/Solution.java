package Level_4.Task_0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Сортировка трех чисел # 0420.
 * @task Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 * Выведенные числа должны быть разделены пробелом.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить числа на экран.
 * •	Программа должна выводить три числа разделенных пробелами.
 * •	Программа должна выводить числа в порядке убывания.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        String vvod3 = reader.readLine();
        int c1 = Integer.parseInt(vvod1);
        int c2 = Integer.parseInt(vvod2);
        int c3 = Integer.parseInt(vvod3);

        int min = Math.min(Math.min(c1, c2), c3);
        int max = Math.max(Math.max(c1, c2), c3);
        c2 = (c1 + c2 + c3) - min - max;
        c1 = min;
        c3 = max;
        System.out.println(c3 + " " + c2 + " " + c1);
    }
}
