package Level_4.Task_0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Положительное и отрицательное число # 0412.
 * @task Ввести с клавиатуры число.
 * Если число положительное, то увеличить его в два раза.
 * Если число отрицательное, то прибавить единицу.
 * Если введенное число равно нулю, необходимо вывести ноль.
 * Вывести результат на экран.
 *
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
 * •	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
 * •	Если введенное число равно нулю, необходимо вывести ноль.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String chislo2 = reader.readLine();
        int chislo1 = Integer.parseInt(chislo2);
        if (chislo1 == 0 ) {
            System.out.println(chislo1);
        } else {
            if (chislo1 > 0) {
                System.out.println(chislo1 * 2);
            } else {
                System.out.println(chislo1 + 1);
            }
        }
    }
}
