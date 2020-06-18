package Level_4.Task_0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title Как-то средненько # 0441.
 * @task Ввести с клавиатуры три числа, вывести на экран среднее из них.
 * Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить среднее из трех чисел.
 * •	Если все числа равны, вывести любое из них.
 * •	Если два числа из трех равны, вывести любое из двух.
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
        int min = 0;
        int max = 0;
        int sr = 0;

        if (ch1 > ch2) max = ch1;
        else max = ch2;
        if (max > ch3) max = max;
        else max = ch3;
        if (ch1 < ch2) min = ch1;
        else min = ch2;
        if (min < ch3) min = min;
        else min = ch3;
        sr = (ch1 + ch2 + ch3) - min -max;
        System.out.println(sr);
    }
}
