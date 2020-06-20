package Level_7.Task_0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Минимаксы в массивах # 0721.
 * @task Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 *
 * Требования:
 * •	Создай массив целых чисел (int[]) на 20 элементов.
 * •	Считай с клавиатуры 20 целых чисел и добавь их в массив.
 * •	Найди и выведи через пробел максимальное и минимальное числа.
 * •	Используй цикл for.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[20];
        for (int a = 0; a < list.length; a++) {
            list[a] = Integer.parseInt(reader.readLine());
        }
        int maximum = list [0];
        int minimum = list [0];
        for (int b = 0; b < list.length; b++) {
            if (list [b] > maximum ) {
                maximum = list [b];
            }
        }
        for (int c = 0; c < list.length; c++) {
            if (list [c] < minimum) {
                minimum = list [c];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
