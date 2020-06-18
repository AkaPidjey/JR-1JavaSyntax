package Level_4.Task_0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Фейс-контроль # 0423.
 * @task Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
 *
 * Требования:
 * •	Программа должна считывать строки c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
 * •	Если возраст меньше либо равно 20 ничего не выводить.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        int itog = Integer.parseInt(age);

        if ( itog > 20)
            System.out.println("И 18-ти достаточно");
    }
}
