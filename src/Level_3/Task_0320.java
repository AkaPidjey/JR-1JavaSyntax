package Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Скромность украшает программиста # 0320.
 * @task Ввести с клавиатуры имя и вывести надпись:
 * name зарабатывает $5,000. Ха-ха-ха!
 *
 * Пример:
 * Тимур зарабатывает $5,000. Ха-ха-ха!
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Программа должна считывать данные с клавиатуры.
 * •	Выведенный текст должен содержать введенное имя.
 * •	Выведенный текст должен полностью соответствовать заданию.
 */

public class Task_0320 {
    public static void main(String[] args) throws IOException {
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        br.close();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
