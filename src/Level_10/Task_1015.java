package Level_10;

import java.util.ArrayList;

/**
 * Title - Массив списков строк # 1015.
 * @task Создать массив, элементами которого будут списки строк.
 * Заполнить массив любыми данными и вывести их на экран.
 *
 * Требования:
 * •	Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
 * •	Метод createList должен возвращать созданный массив.
 * •	Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
 * •	Программа должна выводить данные на экран.
 * •	Метод main должен вызывать метод createList.
 * •	Метод main должен вызывать метод printList.
 */

public class Task_1015 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = (ArrayList<String>[])new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add(0, "string1");
        list1.add(1, "string2");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add(0, "string3");
        list2.add(1, "string4");
        list[0] = list1;
        list[1] = list2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
