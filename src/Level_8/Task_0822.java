package Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Title - Минимальное из N чисел # 0822.
 * @task 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3. Найти минимальное число среди элементов списка - метод getMinimum.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна считывать значения с клавиатуры.
 * •	Класс Solution должен содержать только три метода.
 * •	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов,
 * заполненный числами с клавиатуры.
 * •	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
 * •	Метод main() должен вызывать метод getIntegerList().
 * •	Метод main() должен вызывать метод getMinimum().
 */

public class Task_0822 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int b = 0; b < array.size(); b++) {
            if (array.get(b) < min) {
                min = array.get(b);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int vvod1 = Integer.parseInt(reader.readLine());
        for (int a = 0; a < vvod1; a++) {
            list.add(a, Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
