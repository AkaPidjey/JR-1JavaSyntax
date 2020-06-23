package Level_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Задача по алгоритмам # 0830.
 * @task Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна считывать значения с клавиатуры.
 * •	Класс Solution должен содержать три метода.
 * •	Метод main() должен вызывать метод sort().
 * •	Метод sort() должен вызывать метод isGreaterThan().
 * •	Выведенные слова должны быть отсортированы в алфавитном порядке.
 */

public class Task_0830 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b < array.length; b++) {
                if (isGreaterThan(array[a], array[b]) == true) {
                    String tmp = array[b];
                    array[b] = array[a];
                    array[a] = tmp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
