package Level_7.Task_0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Выражаемся покороче # 0709.
 * @task 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
 * •	Программа должна выводить самую короткую строку на экран.
 * •	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine()); }
        int min = list.get(0).length();
        for (int a = 1; a < list.size(); a++) {
            if (list.get(a).length() < min) {
                min = list.get(a).length();
            }
        }
        for (int b = 0; b < 5; b++) {
            if (min == list.get(b).length()) {
                System.out.println(list.get(b));
            }
        }
    }
}
