package Level_4.Task_0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Переходим дорогу вслепую # 0416.
 * @task Работа светофора для пешеходов запрограммирована следующим образом:
 * в начале каждого часа в течение трех минут горит зелёный сигнал,
 * затем в течение одной минуты - жёлтый,
 * а потом в течение одной минуты - красный,
 * затем опять зелёный горит три минуты и т. д.
 * Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 * Определить, сигнал какого цвета горит для пешеходов в этот момент.
 * Результат вывести на экран в следующем виде:
 * "зелёный" - если горит зелёный цвет,
 * "жёлтый" - если горит жёлтый цвет,
 * "красный" - если горит красный цвет.
 *
 * Пример для числа 2.5:
 * зелёный
 *
 * Пример для числа 3:
 * жёлтый
 *
 * Пример для числа 4:
 * красный
 *
 * Пример для числа 5:
 * зелёный
 *
 * Требования:
 * •	Программа должна считывать вещественное число c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Если горит зелёный цвет, необходимо вывести текст: "зелёный"
 * •	Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
 * •	Если горит красный цвет, необходимо вывести текст: "красный"
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String perem = reader.readLine();
        double vrem = Double.parseDouble(perem);
        double per;

        if (vrem < 5) {
            if (vrem >= 0 & vrem < 3) {
                System.out.println("зелёный");
            } else if (vrem >= 3 & vrem < 4) {
                System.out.println("жёлтый");
            } else if (vrem >= 4 & vrem <= 5) {
                System.out.println("красный" );
            }
        }
        else {
            per =  vrem % 5;
            if (per >= 0 & per < 3) {
                System.out.println("зелёный");
            } else if (per >= 3 & per < 4) {
                System.out.println("жёлтый");
            } else if (per >= 4 & per <= 5) {
                System.out.println("красный");
            }
        }
    }
}