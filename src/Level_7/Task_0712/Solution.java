package Level_7.Task_0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Самые-самые # 0712.
 * @task 1. Создай список строк.
 * 2. Добавь в него 10 строчек с клавиатуры.
 * 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 * Если таких строк несколько, то должны быть учтены самые первые из них.
 * 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
 * •	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
 * •	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
 * •	Должна быть выведена только одна строка.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 10; a++) {
            list.add(a, reader.readLine());
        }
        int min = 10;
        int max = 0;
        int Nmin = 0;
        int Nmax = 0;
        String Znmin = "";
        String Znmax = "";
        for (int b = 0; b < 10; b++) {
            if (list.get(b).length() < min) {
                min = list.get(b).length();
                Znmin = list.get(b);
                Nmin = b;
            }
        }
        for (int c = 0; c < 10; c++) {
            if (list.get(c).length() > max) {
                max = list.get(c).length();
                Znmax = list.get(c);
                Nmax = c;
            }
        }
        if (Nmin < Nmax) {
            System.out.println(Znmin);
        } else {
            System.out.println(Znmax);
        }
    }
}
