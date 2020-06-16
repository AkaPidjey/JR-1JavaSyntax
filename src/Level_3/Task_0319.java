package Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Предсказание на будущее # 0319.
 * @task Ввести с клавиатуры отдельно Имя, число1, число2.
 * Вывести надпись:
 * "Имя" получает "число1" через "число2" лет.
 *
 * Пример:
 * Коля получает 3000 через 5 лет.
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Программа должна считывать данные с клавиатуры.
 * •	Выведенный текст должен содержать введенное имя.
 * •	Выведенный текст должен содержать введенное число1.
 * •	Выведенный текст должен содержать введенное число2.
 * •	Выведенный текст должен полностью соответствовать заданию.
 */

public class Task_0319 {
    public static void main(String[] args) throws IOException {
        String name;
        int year;
        int zp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br. readLine();
        zp = Integer.parseInt(br.readLine());
        year = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(name + " получает " + zp + " через " + year + " лет.");
    }
}
