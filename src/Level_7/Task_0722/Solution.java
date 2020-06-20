package Level_7.Task_0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Это конец # 0722.
 * @task Создать список строк.
 * Ввести строки с клавиатуры и добавить их в список.
 * Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
 * Вывести строки на экран, каждую с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
 * •	Саму строку "end" не нужно добавлять в список.
 * •	Выведи список на экран, каждое значение с новой строки.
 * •	Используй цикл for.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; ; a++) {
            list.add(a, reader.readLine());
            if (list.get(a).contains("end")) {
                break;
            }
        }
        list.remove(list.size() - 1);
        for (int b = 0; b < list.size() ; b++) {
            System.out.println(list.get(b));
        }
    }
}
