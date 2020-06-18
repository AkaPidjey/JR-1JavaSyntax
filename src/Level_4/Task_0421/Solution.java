package Level_4.Task_0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Настя или Настя? # 0421.
 * @task Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
 * Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
 * Если имена и длины имен разные - ничего не выводить.
 *
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если имена одинаковые вывести сообщение "Имена идентичны"
 * •	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
 * •	Если имена и длины имен разные - ничего не выводить.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String im1 = reader.readLine();
        String im2 = reader.readLine();
        int dl1 = im1.length();
        int dl2 = im2.length();

        if (im1.equals(im2))
            System.out.println("Имена идентичны");
        else if (dl1 == dl2)
            System.out.println("Длины имен равны");
    }
}
