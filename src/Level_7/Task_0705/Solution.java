package Level_7.Task_0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Title - Один большой массив и два маленьких # 0705.
 * @task 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 *
 * Требования:
 * •	Программа должна создавать большой массив на 20 целых чисел.
 * •	Программа должна считывать с клавиатуры 20 чисел для большого массива.
 * •	Программа должна создавать два маленьких массива на 10 чисел каждый.
 * •	Программа должна скопировать одну половину большого массива в первый маленький,
 * а вторую - во второй и вывести второй маленький массив на экран.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] listBol = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listBol.length; i++){
            listBol[i] = Integer.parseInt(reader.readLine());
        }
        int [] listMal1 = new int[10];
        int [] listMal2 = new int[10];
        listMal1 = Arrays.copyOf(listBol, 10);
        listMal2 = Arrays.copyOfRange(listBol,10, 20);
        //    System.out.println(Arrays.toString(listMal2));
        for (int i = 0; i < listMal2.length; i++) {
            System.out.println(listMal2[i]);
        }
    }
}
