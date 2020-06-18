package Level_4.Task_0434;

/**
 * Title - Таблица умножения # 0434.
 * @task Вывести на экран таблицу умножения 10х10 используя цикл while.
 * Числа разделить пробелом.
 *
 * Пример вывода на экран:
 * 1 2 3 4 5 6 7 8 9 10
 * 2 4 6 8 10 12 14 16 18 20
 * 3 6 9 12 15 18 21 24 27 30
 * 4 8 12 16 20 24 28 32 36 40
 * 5 10 15 20 25 30 35 40 45 50
 * 6 12 18 24 30 36 42 48 54 60
 * 7 14 21 28 35 42 49 56 63 70
 * 8 16 24 32 40 48 56 64 72 80
 * 9 18 27 36 45 54 63 72 81 90
 * 10 20 30 40 50 60 70 80 90 100
 *
 * Требования:
 * •	Программа не должна считывать текст c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить таблицу умножения 10х10.
 * •	В программе должен использоваться только цикл while.
 */

public class Solution {
    public static void main(String[] args) {
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;
        int s4 = 4;
        int s5 = 5;
        int s6 = 6;
        int s7 = 7;
        int s8 = 8;
        int s9 = 9;
        int s10 = 10;

        while (s1 < 11) {
            System.out.print(s1);
            System.out.print(" ");
            s1++;
        }
        System.out.println("");
        while (s2 < 21) {
            System.out.print(s2);
            System.out.print(" ");
            s2 = s2 + 2;
        }
        System.out.println("");
        while (s3 < 31) {
            System.out.print(s3);
            System.out.print(" ");
            s3 = s3 + 3;
        }
        System.out.println("");
        while (s4 < 41) {
            System.out.print(s4);
            System.out.print(" ");
            s4 = s4 + 4;
        }
        System.out.println("");
        while (s5 < 51) {
            System.out.print(s5);
            System.out.print(" ");
            s5 = s5 + 5;
        }
        System.out.println("");
        while (s6 < 61) {
            System.out.print(s6);
            System.out.print(" ");
            s6 = s6 + 6;
        }
        System.out.println("");
        while (s7 < 71) {
            System.out.print(s7);
            System.out.print(" ");
            s7 = s7 + 7;
        }
        System.out.println("");
        while (s8 < 81) {
            System.out.print(s8);
            System.out.print(" ");
            s8 = s8 + 8;
        }
        System.out.println("");
        while (s9 < 91) {
            System.out.print(s9);
            System.out.print(" ");
            s9 = s9 + 9;
        }
        System.out.println("");
        while (s10 < 101) {
            System.out.print(s10);
            System.out.print(" ");
            s10 = s10 + 10;
        }
        System.out.println("");
    }
}
