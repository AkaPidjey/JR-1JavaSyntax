package Level_7.Task_0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Переверни массив # 0704.
 * @task 1. Создать массив на 10 чисел.
 * 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 * 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 *
 * Требования:
 * •	Программа должна создавать массив на 10 целых чисел.
 * •	Программа должна считывать числа для массива с клавиатуры.
 * •	Программа должна выводить 10 строчек, каждую с новой строки.
 * •	Массив должен быть выведен на экран в обратном порядке.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] list = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = list.length - 1; i >= 0; i-- ) {
            System.out.println(list[i]);
        }
    }
}
