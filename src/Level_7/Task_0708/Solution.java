package Level_7.Task_0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Самая длинная строка # 0708.
 * @task 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 *
 * Требования:
 * •	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
 * •	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
 * •	Программа должна выводить самую длинную строку на экран.
 * •	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
 */

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 5; a++) {
            strings.add(a, reader.readLine());
        }
        int max = strings.get(0).length();
        for (int b = 0; b < strings.size(); b++) {
            if (strings.get(b).length() > max) {
                max = strings.get(b).length();
            }
        }
        for (int c = 0; c < 5; c++) {
            if (max == strings.get(c).length()) {
                System.out.println( strings.get(c));
            }
        }
    }
}
