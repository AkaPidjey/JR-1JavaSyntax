package Level_7.Task_0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - В убывающем порядке # 0728.
 * @task Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 *
 * Требования:
 * •	Программа должна считывать 20 целых чисел с клавиатуры.
 * •	Программа должна выводить 20 чисел.
 * •	В классе Solution должен быть метод public static void sort(int[] array).
 * •	Метод main должен вызывать метод sort.
 * •	Метод sort должен сортировать переданный массив по убыванию.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int a = 1; a < array.length; a++) {
            for (int b = 0; b < array.length - a; b++) {
                if (array[b] < array[b + 1]) {
                    int max = array[b + 1];
                    int min = array[b];
                    array[b] = max;
                    array[b + 1] = min;
                }
            }
        }
    }
}
