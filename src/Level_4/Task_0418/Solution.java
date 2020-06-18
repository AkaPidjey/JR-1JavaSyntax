package Level_4.Task_0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Минимум двух чисел # 0418.
 * @task Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
 * Если два числа равны между собой, необходимо вывести любое.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран минимальное из двух целых чисел.
 * •	Если два числа равны между собой, необходимо вывести любое.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        int chislo1 = Integer.parseInt(vvod1);
        int chislo2 = Integer.parseInt(vvod2);

        if (chislo1 == chislo2) {
            System.out.println(chislo1);
        } else if (chislo1 > chislo2) {
            System.out.println(chislo2);
        } else {
            System.out.println(chislo1);
        }
    }
}
