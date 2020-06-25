package Level_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Title - Поправочки нужны # 1018.
 * @task Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
 * помещает их в HashMap и выводит на экран содержимое HashMap.
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Класс Solution должен содержать три переменные.
 * •	Программа должна помещать в HashMap 10 пар считанных с клавиатуры.
 * •	Программа должна выводить на экран содержимое HashMap. Каждое значение с новой строки.
 */


public class Task_1018 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Task_1018() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        Task_1018 task = new Task_1018();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            task.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : task.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
