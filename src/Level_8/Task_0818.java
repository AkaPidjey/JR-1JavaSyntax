package Level_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Title - Только для богачей # 0818.
 * @task Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer
 * состоящих из 10 записей по принципу «фамилия» - «зарплата».
 * •	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */

public class Task_0818 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("иванов", 100);
        map.put("петров", 200);
        map.put("сидоров", 300);
        map.put("васечкин", 400);
        map.put("музякин", 500);
        map.put("пузякин", 600);
        map.put("лазутин", 700);
        map.put("иващин", 800);
        map.put("амигин", 900);
        map.put("верещагин", 1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500){
                iterator.remove();
            }
        }
    /*    for (Map.Entry<String, Integer> pair : map.entrySet()) {
            Integer value = pair.getValue();
            String key = pair.getKey();
            System.out.println(key + "-" + value);
        }
    */
    }

    public static void main(String[] args) {
    }
}
