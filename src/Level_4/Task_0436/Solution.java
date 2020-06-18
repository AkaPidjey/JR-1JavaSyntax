package Level_4.Task_0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Рисуем прямоугольник # 0436.
 * @task Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 *
 * Пример: m=2, n=4
 * 8888
 * 8888
 *
 * Требования:
 * •	Программа должна считывать два числа c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить прямоугольник размером m на n из восьмёрок.
 * •	В программе должен использоваться цикл for.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod1 = reader.readLine();
        String vvod2 = reader.readLine();
        int m = Integer.parseInt(vvod1);
        int n = Integer.parseInt(vvod2);

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("8");
            }
            System.out.println(" ");
        }
    }
}
