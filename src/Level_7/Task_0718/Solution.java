package Level_7.Task_0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Проверка на упорядоченность # 0718.
 * @task 1. Введи с клавиатуры 10 слов в список строк.
 * 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 * 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Считай 10 строк с клавиатуры и добавь их в список.
 * •	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
 * •	Если список не упорядочен по возрастанию длины строки,
 * то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 10; a++) {
            list.add(a, reader.readLine());
        }
        for ( int b = 1; b < list.size();) {
            if (list.get(b).length() >= list.get(b - 1).length()) {
                b++;
            } else {
                System.out.println(b);
                break;
            }
        }
    }
}
