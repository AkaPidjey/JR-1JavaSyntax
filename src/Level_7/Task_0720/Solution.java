package Level_7.Task_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Перестановочка подоспела # 0720.
 * @task Ввести с клавиатуры 2 числа N и M.
 * Ввести N строк и заполнить ими список.
 * Переставить M первых строк в конец списка.
 * Вывести список на экран, каждое значение с новой строки.
 *
 * Примечание: запрещено создавать больше одного списка.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
 * •	Переставить M первых строк в конец списка.
 * •	Выведи список на экран, каждое значение с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int a = 0; a < n; a++) {
            list.add(a, reader.readLine());
        }
        for (int b = 0; b < m; b++) {
            int sc = 0;
            list.add(list.get(sc));
            list.remove(sc);
            sc--;
        }
        for (int c = 0; c < list.size(); c++) {
            System.out.println(list.get(c));
        }
    }
}
