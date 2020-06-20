package Level_7.Task_0716;

import java.util.ArrayList;

/**
 * Title - Р или Л # 0716.
 * @task 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву "р"
 * 2.2. удваивать все слова содержащие букву "л".
 * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 *
 * Пример:
 * роза
 * лира
 * лоза
 *
 * Выходные данные:
 * лира
 * лоза
 * лоза
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод fix должен удалять из списка строк все слова, содержащие букву "р".
 * Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
 * •	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом).
 * Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
 * •	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
 * •	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
 */

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int a = 0; a < strings.size(); a++) {
            if (strings.get(a).contains("р") && ! strings.get(a).contains("л")) {
                strings.remove(a);
                a--;
            } else if (strings.get(a).contains("л") && ! strings.get(a).contains("р")) {
                strings.add(a, strings.get(a));
                a++;
            } else if (strings.get(a).contains("р") && strings.get(a).contains("л")) {
                continue;
            }
        }
        return strings;
    }
}
