package Level_4.Task_0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Хорошего много не бывает # 0432.
 * @task Ввести с клавиатуры строку и число N больше 0.
 * Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
 *
 * Пример ввода:
 * абв
 * 2
 *
 * Пример вывода:
 * абв
 * абв
 *
 * Требования:
 * •	Программа должна считывать текст c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Каждое значение должно быть выведено с новой строки.
 * •	Программа должна выводить на экран строку N раз.
 * •	В программе должен использоваться цикл while.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        int ch = Integer.parseInt(vvod2);
        int i = 0;

        while ( i < ch) {
            System.out.println(vvod1);
            i++;
        }
    }
}
