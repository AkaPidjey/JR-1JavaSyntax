package Level_3;

/**
 * Title - Печатаем строки # 0311.
 * @task Реализуй метод public static void writeToConsole(String s), который добавляет к началу строки
 * выражение "printing: " и выводит измененную строку на экран.
 *
 * Пример вывода для "Hello world!":
 * printing: Hello world!
 *
 * Требования:
 * •	Добавь метод writeToConsole, у которого аргумент имеет тип String.
 * •	Метод writeToConsole должен быть void.
 * •	Метод writeToConsole должен быть static.
 * •	Метод writeToConsole должен быть public.
 * •	Метод writeToConsole должен добавлять к началу строки "printing: " и выводить полученный результат на экран.
 * •	Программа должна вывести "printing: Hello world!".
 */

public class Task_0311 {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }
}
