package Level_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Title - Перепись населения # 0815.
 * @task Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
 * Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
 * String состоящих из 10 записей по принципу «Фамилия» - «Имя».
 * •	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
 * •	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */

public class Task_0815 {
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count1 = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) {
                count1++;
            }
        }
        return count1;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count2 = 0;
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> pair2 = iterator2.next();
            String key = pair2.getKey();
            if (key.equals(lastName)) {
                count2++;
            }
        }
        return count2;
    }

    public static void main(String[] args) {
    }
}
