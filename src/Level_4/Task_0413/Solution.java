package Level_4.Task_0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - День недели # 0413.
 * @task Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
 * "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
 * если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
 *
 * Пример для номера 5:
 * пятница
 *
 * Пример для номера 10:
 * такого дня недели не существует
 *
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Если введено число от 1 до 7, необходимо вывести день недели.
 * •	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvodzn = reader.readLine();
        int denNed = Integer.parseInt(vvodzn);

        if ( denNed == 1 ) {
            System.out.println("понедельник");
        } else if ( denNed == 2 ) {
            System.out.println("вторник");
        } else if ( denNed == 3 ) {
            System.out.println("среда");
        } else if ( denNed == 4 ) {
            System.out.println("четверг");
        } else if ( denNed == 5 ) {
            System.out.println("пятница");
        } else if ( denNed == 6 ) {
            System.out.println("суббота");
        } else if ( denNed == 7 ) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}
