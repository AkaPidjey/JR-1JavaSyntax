package Level_9;

/**
 * Title - Исключение при работе со строками # 0908.
 * @task Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * String s = null;
 * String m = s.toLowerCase();
 *
 * Требования:
 * •	Программа должна выводить сообщение на экран.
 * •	В программе должен быть блок try-catch.
 * •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * •	Выведенное сообщение должно содержать тип возникшего исключения.
 * •	Имеющийся код в методе main не удалять.
 */

public class Task_0908 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
