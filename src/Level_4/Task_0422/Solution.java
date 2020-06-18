package Level_4.Task_0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - 18+ # 0422.
 * @task Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
 *
 * Требования:
 * •	Программа должна дважды считать данные c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
 * •	Если возраст больше либо равно 18 ничего не выводить.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        int it = Integer.parseInt(age);

        if (it < 18)
            System.out.println("Подрасти еще");
    }
}
