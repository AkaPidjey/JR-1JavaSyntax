package Level_3;

/**
 * Title - Немедленно в печать # 0302.
 * @task Добавь метод public static void printString(String s), в нем напиши код,
 * который будет выводить переданную строку на экран.
 *
 * Требования:
 * •	Добавь метод printString, у которого аргумент имеет тип String.
 * •	Метод printString должен быть void.
 * •	Метод printString должен быть static.
 * •	Метод printString должен быть public.
 * •	Метод printString должен выводить переданный текст на экран.
 * •	Программа должна вывести "Hello, Amigo!".
 */

public class Task_0302 {
    public static void printString(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        printString("Hello, Amigo!");
    }
}
