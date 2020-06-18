package Level_4.Task_0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title Как назвали, так назвали # 0443.
 * @task Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 *
 * Вывести на экран текст:
 * "Меня зовут name.
 * Я родился d.m.y"
 *
 * Пример вывода:
 * Меня зовут Вася.
 * Я родился 15.2.1988
 *
 * Требования:
 * •	Программа должна считывать строки c клавиатуры.
 * •	Программа должна выводить строки на экран.
 * •	Программа должна выводить текст, шаблон которого указан в задании.
 * •	Каждое предложение вывести с новой строки.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        String vvod3 = reader.readLine();
        int y = Integer.parseInt(vvod1);
        int m = Integer.parseInt(vvod2);
        int d = Integer.parseInt(vvod3);
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
