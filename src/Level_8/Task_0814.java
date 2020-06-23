package Level_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Title - Больше 10? Вы нам не подходите # 0814.
 * @task Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Класс Solution должен содержать только три метода.
 * •	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
 * •	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */

public class Task_0814 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        for (int a = 0; a < 20; a++) {
            set.add(a);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a > 10) {
                iterator.remove();
            }
        }
        return set;
    }
    public static void main(String[] args) {
    }
}
