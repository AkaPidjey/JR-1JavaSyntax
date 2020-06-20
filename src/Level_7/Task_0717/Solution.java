package Level_7.Task_0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Удваиваем слова # 0717.
 * @task 1. Введи с клавиатуры 10 слов в список строк.
 *
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 *
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Считай 10 строк с клавиатуры и добавь их в список.
 * •	Метод doubleValues должен удваивать элементы списка по принципу
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * •	Выведи получившийся список на экран, каждый элемент с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 10; a++) {
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (int c = 0; c < result.size(); c++) {
            System.out.println(result.get(c));
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int b = 0; b < list.size(); b++) {
            String pereh1 = list.get(b);
            int pereh2 = b++;
            list.add(pereh2, pereh1);
        }
        return list;
    }
}
