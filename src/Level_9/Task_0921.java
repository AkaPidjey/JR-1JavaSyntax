package Level_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Метод в try..catch # 0921.
 * @task Написать программу, которая будет вводить числа с клавиатуры.
 * Код по чтению чисел с клавиатуры должен быть в методе readData.
 * Код внутри readData обернуть в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа,
 * то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Метод main не изменять.
 * •	Метод main не должен кидать исключений.
 * •	Метод readData должен содержать блок try..catch.
 * •	Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.
 */

public class Task_0921 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            try {
                int a = Integer.parseInt(reader.readLine());
                numbers.add(a);
            } catch (NumberFormatException | IOException e) {
                for (int x : numbers)
                    System.out.println(x);
                break;
            }
        }
    }
}
