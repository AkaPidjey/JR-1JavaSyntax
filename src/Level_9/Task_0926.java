package Level_9;

import java.util.ArrayList;

/**
 * Title - Список из массивов чисел # 0926.
 * @task Создать список, элементами которого будут массивы чисел.
 * Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
 * Заполнить массивы любыми данными и вывести их на экран.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
 * •	Метод createList должен возвращать созданный список.
 * •	Метод createList должен добавлять в список 5 элементов.
 * •	Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов,
 * второго - 2, следующих - 4, 7, 0 соответственно.
 * •	Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
 */

public class Task_0926 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] mas1 = new int[]{1, 2, 3, 4, 5};
        int[] mas2 = new int[]{6, 7};
        int[] mas3 = new int[]{8, 9, 10, 11};
        int[] mas4 = new int[]{12, 13, 14, 15, 16, 17, 18};
        int[] mas5 = new int[]{};
        ArrayList<int[]> list1 = new ArrayList<int[]>();
        list1.add(mas1);
        list1.add(mas2);
        list1.add(mas3);
        list1.add(mas4);
        list1.add(mas5);
        return list1;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
