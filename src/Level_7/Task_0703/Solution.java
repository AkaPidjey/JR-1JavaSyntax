package Level_7.Task_0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Общение одиноких массивов # 0703.
 * @task 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 *
 * Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 *
 * Требования:
 * •	Программа должна создавать массив на 10 строк.
 * •	Программа должна создавать массив на 10 целых чисел.
 * •	Программа должна считывать строки для массива с клавиатуры.
 * •	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] listStr = new String[10];
        int [] listCis = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listStr.length; i++) {
            listStr[i] = reader.readLine();
        }
        listCis[0] = listStr[0].length();
        listCis[1] = listStr[1].length();
        listCis[2] = listStr[2].length();
        listCis[3] = listStr[3].length();
        listCis[4] = listStr[4].length();
        listCis[5] = listStr[5].length();
        listCis[6] = listStr[6].length();
        listCis[7] = listStr[7].length();
        listCis[8] = listStr[8].length();
        listCis[9] = listStr[9].length();
        for (int i = 0; i < listCis.length; i++) {
            System.out.println(listCis[i]);
        }
    }
}
