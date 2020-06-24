package Level_9;

import java.util.ArrayList;

/**
 * Title - Исключение при работе с коллекциями List # 0910.
 * @task Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
 * ArrayList<String> list = new ArrayList<String>();
 * String s = list.get(18);
 *
 * Требования:
 * •	Программа должна выводить сообщение на экран.
 * •	В программе должен быть блок try-catch.
 * •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * •	Выведенное сообщение должно содержать тип возникшего исключения.
 * •	Имеющийся код в методе main не удалять.
 */

public class Task_0910 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
