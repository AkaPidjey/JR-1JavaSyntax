package Level_3;

/**
 * Title - Мама мыла раму # 0313.
 * @task Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
 *
 * Подсказка: их 6 штук.
 * Каждую комбинацию вывести с новой строки. Слова не разделять.
 *
 * Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Выведенный текст должен содержать 6 строк.
 * •	Текст в каждой строке должен быть уникален.
 * •	Должны быть выведены все возможные комбинации.
 */

public class Task_0313 {
    public static void main(String[] args) {
        String str1 = "Мама";
        String str2 = "Мыла";
        String str3 = "Раму";
        System.out.println(str1 + str2 + str3);
        System.out.println(str2 + str3 + str1);
        System.out.println(str3 + str2 + str1);
        System.out.println(str1 + str3 + str2);
        System.out.println(str2 + str1 + str3);
        System.out.println(str3 + str1 + str2);
    }
}
