package Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Title - Cамая длинная последовательность # 0812.
 * @task 1. Создай список чисел.
 * 2. Добавь в список 10 чисел с клавиатуры.
 * 3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 *
 * Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
 * 3
 *
 * Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 *
 * Требования:
 * •	Программа должна выводить число на экран.
 * •	Программа должна считывать значения с клавиатуры.
 * •	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
 * •	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
 * •	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
 */

public class Task_0812 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s4 = 1;
        int max = 1;
        List<Integer> list = new ArrayList<Integer>();
        for (int a = 0; a < 10; a++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int b = 0; b < 9; b++) {
            if (list.get(b).equals(list.get(b + 1)) ) {
                s4++;
                if (s4 > max) {
                    max = s4;
                }
            } else {
                s4 = 1;
            }
        }
        System.out.println(max);
    }
}
