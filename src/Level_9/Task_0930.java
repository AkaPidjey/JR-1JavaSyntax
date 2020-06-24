package Level_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title - Задача по алгоритмам # 0930.
 * @task Задача: Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 *
 * Пример ввода:
 * Вишня
 * 1
 * Боб
 * 3
 * Яблоко
 * 22
 * 0
 * Арбуз
 *
 * Пример вывода:
 * Арбуз
 * 22
 * Боб
 * 3
 * Вишня
 * 1
 * 0
 * Яблоко
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Программа должна выводить данные на экран.
 * •	Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
 * •	Выведенные числа должны быть упорядочены по убыванию.
 * •	Метод main должен использовать метод sort.
 * •	Метод sort должен использовать метод isGreaterThan.
 * •	Метод sort должен использовать метод isNumber.
 */

public class Task_0930 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }
        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        int[]input = new int[array.length];
        List<Integer> resultNumber = new ArrayList<>();
        List<String> resultString = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                input[i] = 1;
                resultNumber.add(Integer.parseInt(array[i]));
            } else {
                input[i] = 0;
                resultString.add(array[i]);
            }
        }
        Collections.sort(resultNumber, Collections.reverseOrder());
        Collections.sort(resultString);
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                array[i] = String.valueOf(resultNumber.get(0));
                resultNumber.remove(0);
            } else {
                array[i] = resultString.get(0);
                resultString.remove(0);
            }
        }
        String one = "1";
        String two = "2";
        isGreaterThan(one, two);
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}

