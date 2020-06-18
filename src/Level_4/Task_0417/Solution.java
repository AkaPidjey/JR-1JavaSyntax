package Level_4.Task_0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Существует ли пара? # 0417.
 * @task Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел.
 * Если все три числа равны между собой, то вывести все три.
 *
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * получим вывод
 * 2 2
 *
 * б) при вводе чисел
 * 2
 * 2
 * 2
 * получим вывод
 * 2 2 2
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если два числа равны между собой, необходимо вывести числа на экран.
 * •	Если все три числа равны между собой, необходимо вывести все три.
 * •	Если нет равных чисел, ничего не выводить.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String vved1 = reader.readLine();
        String vved2 = reader.readLine();
        String vved3 = reader.readLine();
        int chislo1 = Integer.parseInt(vved1);
        int chislo2 = Integer.parseInt(vved2);
        int chislo3 = Integer.parseInt(vved3);

        if (chislo1 == chislo2 & chislo1 == chislo3) {
            System.out.println(chislo1 + " " + chislo2 + " " + chislo3);
        } else if (chislo1 == chislo2 ) {
            System.out.println(chislo1 + " " + chislo2);
        } else if (chislo2 == chislo3 ) {
            System.out.println(chislo2 + " " + chislo3);
        } else if  (chislo1 == chislo3) {
            System.out.println(chislo1 + " " + chislo3);
        }
    }
}
