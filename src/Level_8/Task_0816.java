package Level_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Title - Добрая Зинаида и летние каникулы # 0816.
 * @task Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
 * Удалить из словаря всех людей, родившихся летом.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
 * •	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */

public class Task_0816 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Уч1", dateFormat.parse("JANUARY 10 2012"));
        map.put("Уч2", dateFormat.parse("FEBRUARY 10 2012"));
        map.put("Уч3", dateFormat.parse("MARCH 10 2012"));
        map.put("Уч4", dateFormat.parse("APRIL 10 2012"));
        map.put("Уч5", dateFormat.parse("MAY 10 2012"));
        map.put("Уч6", dateFormat.parse("JUNE 10 2012"));
        map.put("Уч7", dateFormat.parse("JULY 10 2012"));
        map.put("Уч8", dateFormat.parse("AUGUST 10 2012"));
        map.put("Уч9", dateFormat.parse("SEPTEMBER 10 2012"));
        map.put("Уч10", dateFormat.parse("OCTOBER 10 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator =  map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date temp = pair.getValue();
            int month = temp.getMonth();
            if (month == 5 || month == 6 || month == 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}
