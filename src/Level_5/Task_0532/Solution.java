package Level_5.Task_0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Задача по алгоритмам # 0532.
 * @task Написать программу, которая:
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 *
 * Требования:
 * •	Программа должна считывать числа с клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	В классе должен быть метод public static void main.
 * •	Нельзя добавлять новые методы в класс Solution.
 * •	Программа должна выводить на экран максимальное из введенных N чисел.
 * •	Программа не должна ничего выводить на экран, если N меньше либо равно 0.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        String pr = reader.readLine();
        int N = Integer.parseInt(pr);

        if (N <= 0) { }
        else {
            for (int a = 0; a < N; a++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            maximum = list.get(0);
            for (int b = 0; b < list.size(); b++) {
                if (list.get(b) > maximum) {
                    maximum = list.get(b);
                }
            }
            System.out.println(maximum);
        }
    }
}
