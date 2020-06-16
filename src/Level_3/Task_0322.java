package Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Большая и чистая # 0322.
 * @task Ввести с клавиатуры три имени, вывести на экран надпись:
 * name1 + name2 + name3 = Чистая любовь, да-да!
 *
 * Пример:
 * Вася + Ева + Анжелика = Чистая любовь, да-да!
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Программа должна считывать данные с клавиатуры.
 * •	Выведенный текст должен содержать введенное имя name1.
 * •	Выведенный текст должен содержать введенное имя name2.
 * •	Выведенный текст должен содержать введенное имя name3.
 * •	Выведенный тест должен полностью соответствовать заданию.
 */

public class Task_0322 {
    public static void main(String[] args) throws IOException {
        String name1;
        String name2;
        String name3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name1 = br.readLine();
        name2 = br.readLine();
        name3 = br.readLine();
        br.close();
        System.out.println(name1+ " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
