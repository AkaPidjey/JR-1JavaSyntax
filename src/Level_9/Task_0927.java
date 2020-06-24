package Level_9;

import java.util.*;

/**
 * Title - Десять котов # 0927.
 * @task Есть класс кот - Cat, с полем "имя" (String).
 * Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод createMap должен создавать новый объект HashMap<String, Cat>.
 * •	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
 * •	Метод createMap должен возвращать созданный словарь.
 * •	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
 * •	Программа должна вывести всех котов из множества на экран.
 */

public class Task_0927 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats0 = new HashMap<>();
        cats0.put("01", new Cat("cat1"));
        cats0.put("02", new Cat("cat2"));
        cats0.put("03", new Cat("cat3"));
        cats0.put("04", new Cat("cat4"));
        cats0.put("05", new Cat("cat5"));
        cats0.put("06", new Cat("cat6"));
        cats0.put("07", new Cat("cat7"));
        cats0.put("08", new Cat("cat8"));
        cats0.put("09", new Cat("cat9"));
        cats0.put("10", new Cat("cat10"));
        return cats0;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats1 = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            cats1.add(pair.getValue());
        }
        return cats1;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;
        public Cat(String name) {
            this.name = name;
        }
        public String toString() {
            return "Cat " + this.name;
        }
    }
}
