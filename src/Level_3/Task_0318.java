package Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - План по захвату мира # 0318.
 * @task Ввести с клавиатуры число и имя, вывести на экран строку:
 * "имя" захватит мир через "число" лет. Му-ха-ха!
 *
 * Пример:
 * Вася захватит мир через 8 лет. Му-ха-ха!
 *
 * Последовательность вводимых данных имеет большое значение.
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Программа должна считывать данные с клавиатуры.
 * •	Выведенный текст должен содержать введенное имя.
 * •	Выведенный текст должен содержать введенное число.
 * •	Выведенный текст должен полностью соответствовать заданию.
 */

public class Task_0318 {
    public static void main(String[] args) throws IOException {
        String name;
        int year;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        year = Integer.parseInt(br.readLine());
        name = br.readLine();
        br.close();
        System.out.println(name + " захватит мир через " + year + " лет. Му-ха-ха!");
    }
}
