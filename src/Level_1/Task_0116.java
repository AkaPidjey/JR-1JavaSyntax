package Level_1;

/**
 * Title - Вносим изменения в код # 0116
 * @task Внеси изменения в программу, чтобы переменная name имела значение Amigo.
 *
 * Требования:
 * •	Переменной name должно присваиваться значение сразу после создания.
 * •	Должно быть объявлено 2 переменных.
 * •	Значение переменной text изменять нельзя.
 * •	Команду вывода текста на экран изменять нельзя.
 * •	Программа должна выводить текст "Hello, Amigo!".
 */

public class Task_0116 {
    public static void main(String[] args) {
        String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
}
