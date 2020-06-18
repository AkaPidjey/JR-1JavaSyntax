package Level_4.Task_0411;

/**
 * Title - Времена года на Терре # 0411.
 * @task Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень)
 * и вывести на экран.
 *
 * Пример для номера месяца 2:
 * зима
 *
 * Пример для номера месяца 5:
 * весна
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Метод main не должен вызывать функцию System.out.println или System.out.print.
 * •	Метод main должен вызывать метод checkSeason.
 * •	Метод checkSeason должен быть static void, и иметь только один параметр int.
 * •	Метод checkSeason должен выводить текст на экран согласно заданию.
 */

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {

        if (month == 12) {
            System.out.println("зима");
        } else if (month == 1) {
            System.out.println("зима");
        } else if (month == 2) {
            System.out.println("зима");
        } else if (month == 3) {
            System.out.println("весна");
        } else if (month == 4) {
            System.out.println("весна");
        } else if (month == 5) {
            System.out.println("весна");
        } else if (month == 6) {
            System.out.println("лето");
        } else if (month == 7) {
            System.out.println("лето");
        } else if (month == 8) {
            System.out.println("лето");
        } else if (month == 9) {
            System.out.println("осень");
        } else if (month == 10) {
            System.out.println("осень");
        } else if (month == 11) {
            System.out.println("осень");
        }
    }
}
