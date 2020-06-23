package Level_8;

import java.util.HashSet;
import java.util.Set;

/**
 * Title - 20 слов на букву «Л» # 0813.
 * @task Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
 *
 * Требования:
 * •	Не изменяй заголовок метода createSet().
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
 * •	Множество из метода createSet() должно содержать 20 слов на букву «Л».
 */

public class Task_0813 {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        set.add("Лошадь");
        set.add("Лодка");
        set.add("Луна");
        set.add("Луноход");
        set.add("Ливерпуль");
        set.add("Лондон");
        set.add("Лариса");
        set.add("Лейка");
        set.add("Лонжерон");
        set.add("Лужайка");
        set.add("Лес");
        set.add("Лесоруб");
        set.add("Ловушка");
        set.add("Лермонтов");
        set.add("Ласты");
        set.add("Ласточка");
        set.add("Лапочка");
        set.add("Лира");
        set.add("Лиса");
        set.add("Леска");
        return set;
    }

    public static void main(String[] args) {
    }
}
