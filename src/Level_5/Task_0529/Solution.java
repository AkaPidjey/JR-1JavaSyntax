package Level_5.Task_0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Консоль-копилка # 0529.
 * @task Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
 * Вывести на экран полученную сумму.
 *
 * Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка,
 * например "exit", можно с помощью следующей конструкции:
 *
 * BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
 * while (true)
 * {
 * 	String s = buffer.readLine();
 * 	if (s.equals("exit"))
 * 		break;
 * }
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Программа должна прекращать считывать данные с клавиатуры после того пользователь введет
 * слово «сумма» в нижнем регистре и нажмет Enter.
 * •	Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
 * •	Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
 * •	Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
 * •	Программа должна выводить текст на экран.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i;

        for (i = 0; ; i++) {
            String a = reader.readLine();
            if (a.equals("сумма")) {
                System.out.println(sum);
                break; }
            else
                sum = sum + Integer.parseInt(a);
        }
    }
}
