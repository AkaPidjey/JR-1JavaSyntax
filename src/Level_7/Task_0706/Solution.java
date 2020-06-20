package Level_7.Task_0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Улицы и дома # 0706.
 * @task 1. Создать массив на 15 целых чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
 * Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой.
 * Выяснить, на какой стороне улицы проживает больше жителей.
 * 4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
 * или "В домах с четными номерами проживает больше жителей."
 *
 * Примечание:
 * дом с порядковым номером 0 считать четным.
 *
 * Требования:
 * •	Программа должна создавать массив на 15 целых чисел.
 * •	Программа должна считывать числа для массива с клавиатуры.
 * •	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.",
 * если сумма нечетных элементов массива больше суммы четных.
 * •	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.",
 * если сумма четных элементов массива больше суммы нечетных.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        int [] list = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        int sumcet = list[0] + list[2] + list[4] + list[6] + list[8] + list[10] + list[12] + list[14];
        int sumnec = list[1] + list[3]+ list[5] + list[7] + list[9] + list[11] + list[13];

     /*   for (int i = 0; i < list.length; i++) {
            if ( i % 2 == 0) {
                sumcet = Integer.parseInt(reader.readLine());
                sumcet = sumcet + sumcet; }
            else {
                sumnec = Integer.parseInt(reader.readLine());
                sumnec = sumnec + sumnec; }
        }
    */
        if (sumcet > sumnec) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
