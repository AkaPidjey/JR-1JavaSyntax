package Level_9;

/**
 * Title - Исключение при работе с числами # 0912.
 * @task Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 * int num=Integer.parseInt("XYZ");
 * System.out.println(num);
 *
 * Требования:
 * •	Программа должна выводить сообщение на экран.
 * •	В программе должен быть блок try-catch.
 * •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * •	Выведенное сообщение должно содержать тип возникшего исключения.
 * •	Имеющийся код в методе main не удалять.
 */

public class Task_0912 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
