package Level_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title - Задача по алгоритмам # 1020.
 * @task Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
 * Пояснение:
 * Самое минимальное число - 1-е минимальное.
 * Следующее минимальное после него - 2-е минимальное
 *
 * Пример:
 * 1 6 5 7 1 15 63 88
 * Первое минимальное - 1
 * Второе минимальное - 1
 * Третье минимальное - 5
 * Четвертое минимальное - 6
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Класс Solution должен содержать два метода.
 * •	Метод sort() должен сортировать массив элементов.
 * •	Метод main() должен вызывать метод sort().
 * •	Программа должна выводить 10-е и 11-е минимальные числа. Каждое значение с новой строки.
 */

public class Task_1020 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int x : array) {
            result.add(x);
        }
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
    }
}
