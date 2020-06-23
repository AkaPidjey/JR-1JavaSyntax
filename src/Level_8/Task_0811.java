package Level_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Title - Квартет «Методы» # 0811.
 * @task Реализовать 4 метода.
 * Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций
 * (быстрее всего справится с большим количеством операций).
 * Ничего измерять не нужно.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Класс Solution должен содержать только 5 методов.
 * •	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
 * •	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
 * •	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит
 * для операций добавления или вставки элемента.
 * •	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
 */

public class Task_0811 {
    public static List getListForGet() {
        ArrayList<String> list1 = new ArrayList<>();
        return list1;
    }

    public static List getListForSet() {
        ArrayList<String> list2 = new ArrayList<>();
        return list2;
    }

    public static List getListForAddOrInsert() {
        LinkedList<String> list3 = new LinkedList<>();
        return list3;
    }

    public static List getListForRemove() {
        LinkedList<String> list4 = new LinkedList<>();
        return list4;
    }

    public static void main(String[] args) {
    }
}
