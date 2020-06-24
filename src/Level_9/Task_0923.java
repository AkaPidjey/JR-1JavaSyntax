package Level_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Гласные и согласные # 0923.
 * @task Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1. первая строка содержит только гласные буквы из введённой строки.
 * 2. вторая - только согласные буквы и знаки препинания из введённой строки.
 * Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 * Пример ввода:
 * Мама мыла раму.
 *
 * Пример вывода:
 * а а ы а а у
 * М м м л р м .
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	Программа должна выводить две строки.
 * •	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
 * •	Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
 * •	Каждая строка должна заканчиваться пробелом.
 */

public class Task_0923 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        char[] vvod1 = vvod.toCharArray();
        char[] vowelOut = new char[20];
        char[] consonantOut = new char[20];
        char[] consonantOut2 = new char[20];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < vvod1.length; i++) {
            if (isVowel(vvod1[i])) {
                vowelOut[count1] = vvod1[i];
                count1++;
            } else {
                consonantOut[count2] = vvod1[i];
                count2++;
            }
        }
        for (int i = 0; i < consonantOut.length; i++) {
            if (consonantOut[i] != ' ') {
                consonantOut2[count3] = consonantOut[i];
                count3++;
            }
        }
        for (int a = 0; a < vowelOut.length; a++) {
            System.out.print(vowelOut[a] + " ");
        }
        System.out.println();
        for (int b = 0; b < consonantOut.length; b++) {
            System.out.print(consonantOut2[b] + " ");
        }
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
