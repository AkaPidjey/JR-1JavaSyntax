package Level_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Title - Количество букв # 1012.
 * @task Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита).
 * Результат вывести на экран в алфавитном порядке.
 *
 * Пример вывода:
 * а 5
 * б 8
 * в 3
 * г 7
 * д 0
 * ...
 * я 9
 *
 * Требования:
 * •	Программа должна 10 раз считывать данные с клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Выведенный текст должен содержать 33 строки.
 * •	Каждая строка вывода должна содержать букву русского алфавита,
 * пробел и сколько раз буква встречалась в введенных строках.
 */

public class Task_1012 {
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> map = new LinkedHashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }
        for (int i = 0; i < list.size();i++) {
            char[] temp = list.get(i).toCharArray();
            for (int j = 0; j < temp.length; j++) {
                if (map.keySet().contains(temp[j])) {
                    map.put(temp[j], map.get(temp[j]) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
