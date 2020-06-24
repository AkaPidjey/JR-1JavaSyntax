package Level_9;

/**
 * Title - Исключение при работе с числами # 0907.
 * @task Перехватить исключение, возникающее при выполнении кода:
 * int a = 42 / 0;
 * Вывести на экран тип перехваченного исключения.
 *
 * Требования:
 * •	Программа должна выводить сообщение на экран.
 * •	В программе должен быть блок try-catch.
 * •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
 * •	Выведенное сообщение должно содержать тип возникшего исключения.
 * •	Имеющийся код в методе main не удалять.
 */

public class Task_0907 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}