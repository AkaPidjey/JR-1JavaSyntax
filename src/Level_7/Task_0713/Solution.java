package Level_7.Task_0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Title - Играем в Jолушку # 0713.
 * @task 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
 * потом тот, который для x%2, потом последний.
 *
 * Требования:
 * •	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел).
 * Первый список будет главным, а остальные - дополнительными.
 * •	Считать 20 чисел с клавиатуры и добавить их в главный список.
 * •	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
 * •	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
 * •	Добавить в третий дополнительный список все остальные числа из главного.
 * •	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
 * •	Программа должна вывести три дополнительных списка, используя метод printList.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList <Integer> list_3 = new ArrayList<>();
        ArrayList <Integer> list_2 = new ArrayList<>();
        ArrayList <Integer> list_ost = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 20; a++) {
            list.add(a, Integer.parseInt(reader.readLine()));
        }
        for (int b = 0; b < list.size(); b++) {
            if (list.get(b) % 3 == 0) {
                list_3.add(list.get(b));
            }
        }
        for (int c = 0; c < list.size(); c++) {
            if (list.get(c) % 2 == 0) {
                list_2.add(list.get(c));
            }
        }
        for (int d = 0; d < list.size(); d++) {
            if (list.get(d) % 3 != 0 && list.get(d) % 2 != 0) {
                list_ost.add(list.get(d));
            }
        }
        printList(list_3);
        printList(list_2);
        printList(list_ost);
    }
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
