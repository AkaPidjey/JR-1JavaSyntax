package Level_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Финансовые ожидания # 0325.
 * @task Ввести с клавиатуры число n.
 * Вывести на экран надпись "Я буду зарабатывать $n в час".
 *
 * Пример:
 * Я буду зарабатывать $50 в час
 *
 * Требования:
 * •	Программа должна выводить текст.
 * •	Программа должна считывать данные с клавиатуры.
 * •	Выведенный текст должен содержать введенное число n.
 * •	Выведенный тест должен полностью соответствовать заданию.
 */

public class Task_0325 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}
