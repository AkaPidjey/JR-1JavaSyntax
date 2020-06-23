package Level_8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Title - Время для 10 тысяч вставок # 0809.
 * @task Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
 *
 * Требования:
 * •	Программа должна выводить числа на экран.
 * •	Метод main должен вызывать метод getInsertTimeInMs только два раза.
 * •	Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
 * •	Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
 * •	Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
 */

public class Task_0809 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date time1 = new Date();
        insert10000(list);
        Date time2 = new Date();
        long raz = time2.getTime() - time1.getTime();
        return raz;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
