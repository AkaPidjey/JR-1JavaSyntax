package Level_7.Task_0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - В начало списка # 0710.
 * @task 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
 * •	Программа должна добавлять строки в начало списка.
 * •	Программа должна выводить список на экран, каждое значение с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 9; i >= 0; i--) {
            list.add(0, reader.readLine());
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(list.get(i));
        }
    }
}
