package Level_3;

/**
 * Title - Экранирование символов # 0316.
 * @task Вывести на экран следующий текст - две строки:
 * It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 * It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 *
 * Подсказка:
 * \” – экранирование двойной кавычки;
 * \\ – экранирование обратной косой черты (\).
 *
 * Больше про экранирование символов и Escape-последовательности в Java читай в статье.
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Должно быть выведено две строки.
 * •	Текст первый строки должен быть: It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 * •	Текст второй строки должен быть: It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 */

public class Task_0316 {
    public static void main(String[] args) {
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");
    }
}
