package Level_4.Task_0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title Суммирование # 0442.
 * @task Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 *
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 *
 * while (true) {
 *     int number = считываем число;
 *     if (проверяем, что number -1)
 *         break;
 * }
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * •	Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * •	В программе должен использоваться цикл for, while или do-while.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i;
        for (i = 0; ; i++) {
            int a = Integer.parseInt(reader.readLine());
            sum = sum + a;
            if (a == -1)
                break;
        }
        System.out.println(sum);
    }
}
