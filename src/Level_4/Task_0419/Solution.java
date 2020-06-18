package Level_4.Task_0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Максимум четырех чисел # 0419.
 * @task Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 * Если числа равны между собой, необходимо вывести любое.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран максимальное из четырёх чисел.
 * •	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        String vvod3 = reader.readLine();
        String vvod4 = reader.readLine();
        int chislo1 = Integer.parseInt(vvod1);
        int chislo2 = Integer.parseInt(vvod2);
        int chislo3 = Integer.parseInt(vvod3);
        int chislo4 = Integer.parseInt(vvod4);

        if (chislo1 == chislo2 & chislo1 == chislo3 & chislo1 == chislo4) {
            System.out.println(chislo1);
        } else {
            int itog = Metod1(chislo1, chislo2, chislo3, chislo4);
            System.out.println(itog);
        }
    }

    private static int Metod1(int a, int b, int c, int d) {
        int it1, it2, it3;
        if (a > b) it1 = a;
        else it1 = b;
        if (c > d) it2 = c;
        else it2 = d;
        if (it1 > it2) it3 = it1;
        else it3 = it2;
        return it3;
    }
}
