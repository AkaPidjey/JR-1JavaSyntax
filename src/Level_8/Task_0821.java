package Level_8;

import java.util.HashMap;
import java.util.Map;

/**
 * Title - Однофамильцы и тёзки # 0821.
 * @task 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
 * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
 * 4. Вывести содержимое Map на экран.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Класс Solution должен содержать только три метода.
 * •	Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String.
 * Кроме того, добавлять в словарь 10 человек.
 * •	В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
 * •	В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
 * •	Метод printPeopleMap() должен выводить на экран всех людей из словаря Map.
 * Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
 * •	Метод main() должен вызывать метод createPeopleMap().
 * •	Метод main() должен вызывать метод printPeopleMap().
 */


public class Task_0821 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Иванов", "Иван");
        map.put("Федоров", "Иван");
        map.put("Сидоров", "Николай");
        map.put("Осланов", "Ослан");
        map.put("Олегов", "Андрей");
        map.put("Андреев", "Андрей");
        map.put("Максимов", "Максим");
        map.put("Максимов", "Узбек");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
