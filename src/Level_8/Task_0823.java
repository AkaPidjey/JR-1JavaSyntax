package Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Омовение Рамы # 0823.
 * @task Написать программу, которая вводит с клавиатуры строку текста.
 * Программа заменяет в тексте первые буквы всех слов на заглавные.
 * Вывести результат на экран.
 *
 * Пример ввода:
 * мама мыла раму.
 *
 * Пример вывода:
 * Мама Мыла Раму.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна считывать строку с клавиатуры.
 * •	Класс Solution должен содержать один метод.
 * •	Программа должна заменять в тексте первые буквы всех слов на заглавные.
 */

public class Task_0823 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        for (String result : vvod.split("\\b")) {
            System.out.print(result.substring(0, 1).toUpperCase() + result.substring(1));
        }
    }
}
