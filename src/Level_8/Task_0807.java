package Level_8;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Title - LinkedList и ArrayList # 0807.
 * @task Нужно создать два списка - LinkedList и ArrayList.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Программа должна содержать только три метода.
 * •	Метод createArrayList() должен создавать и возвращать список ArrayList.
 * •	Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */

public class Task_0807 {
    public static Object createArrayList() {
        ArrayList<String> list = new ArrayList();
        return list;
    }

    public static Object createLinkedList() {
        LinkedList<String> list2 = new LinkedList<>();
        return list2;
    }

    public static void main(String[] args) {
    }
}
