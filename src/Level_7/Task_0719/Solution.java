package Level_7.Task_0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Вывести числа в обратном порядке # 0719.
 * @task Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Вывести их в обратном порядке. Каждый элемент - с новой строки.
 * Использовать только цикл for.
 *
 * Подсказка:
 * Не забудь импортировать класс: java.util.ArrayList;
 *
 * Требования:
 * •	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
 * •	Считай 10 целых чисел с клавиатуры и добавь их в список.
 * •	Выведи числа в обратном порядке.
 * •	Используй цикл for.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a = 0; a < 10; a++){
            list.add(a, Integer.parseInt(reader.readLine()));
        }
        for (int b = 9; b >= 0; b--) {
            System.out.println(list.get(b));
        }
    }
}
