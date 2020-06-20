package Level_7.Task_0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Удалить и вставить # 0711.
 * @task 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 * 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Программа должна считывать 5 строк с клавиатуры.
 * •	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * •	Программа должна выводить список на экран, каждое значение с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList <String> ();
        String s = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 5; a++) {
            list.add(a, reader.readLine());
        }
        for ( int i = 0; i < 13; i++) {
            s = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, s);
        }
        for (int b = 0; b < list.size(); b++) {
            System.out.println(list.get(b));
        }
    }
}
