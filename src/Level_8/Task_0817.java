package Level_8;

import java.util.*;

/**
 * Title - Нам повторы не нужны # 0817.
 * @task Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
 * Удалить людей, имеющих одинаковые имена.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
 * •	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
 * •	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */

public class Task_0817 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Иванов", "Иван");
        map.put("Федоров", "Иван");
        map.put("Николаев", "Николай");
        map.put("Осланов", "Ослан");
        map.put("Олегов", "Андрей");
        map.put("Андреев", "Андрей");
        map.put("Максимов", "Максим");
        map.put("Узбеков", "Узбек");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String>pair : map.entrySet()) {
            result.add(pair.getValue());
        }
        for (String x : result) {
            if (Collections.frequency(result, x) > 1) {
                removeItemFromMapByValue(map, x);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
