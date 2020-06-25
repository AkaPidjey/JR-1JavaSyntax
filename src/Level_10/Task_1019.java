package Level_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Title - Функциональности маловато! # 1019.
 * @task Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
 * Пустая строка - конец ввода данных.
 * Числа могут повторяться.
 * Строки всегда уникальны.
 * Введенные данные не должны потеряться!
 * Затем программа выводит содержание HashMap на экран.
 * Каждую пару с новой строки.
 *
 * Пример ввода:
 * 1
 * Мама
 * 2
 * Рама
 * 1
 * Мыла
 *
 * Пример вывода:
 * 1 Мыла
 * 2 Рама
 * 1 Мама
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
 * •	Программа должна помещать в HashMap пары считанные с клавиатуры.
 * •	Программа должна выводить на экран содержимое HashMap согласно условию. Ключ и значение разделены пробелом.
 * Каждое значение с новой строки.
 */

public class Task_1019 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        String id;
        String name;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            id = reader.readLine();
            if (id.isEmpty()) { break; }
            name = reader.readLine();
            map.put(name,Integer.parseInt(id) );
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
