package Level_7.Task_0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Слова в обратном порядке # 0714.
 * @task Введи с клавиатуры 5 слов в список строк.
 * Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 *
 * Требования:
 * •	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
 * •	Считай 5 строк с клавиатуры и добавь их в список.
 * •	Удали третий элемент списка.
 * •	Выведи элементы на экран, каждый с новой строки.
 * •	Порядок вывода должен быть обратный.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 5; a++) {
            list.add(a, reader.readLine());
        }
        list.remove(2);
        for (int b = list.size() - 1; b >= 0; b--) {
            System.out.println(list.get(b));
        }
    }
}
