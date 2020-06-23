package Level_8;

import java.util.Date;
import java.util.StringTokenizer;

/**
 * Title - Работа с датой # 0827.
 * @task 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 * если количество дней с начала года - нечетное число, иначе false
 * 2. String date передается в формате FEBRUARY 1 2013
 * Не забудьте учесть первый день года.
 *
 * Пример:
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Класс Solution должен содержать два метода.
 * •	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
 * •	Метод main() должен вызывать метод isDateOdd().
 */

public class Task_0827 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        StringTokenizer subStr = new StringTokenizer(date, " ");
        String monthStr = subStr.nextToken();
        int day = Integer.parseInt(subStr.nextToken());
        int year = Integer.parseInt(subStr.nextToken());
        int month = 0;

        switch (monthStr) {
            case "JANUARY" :
                month = 0;
                break;
            case "FEBRUARY" :
                month = 1;
                break;
            case "MARCH" :
                month = 2;
                break;
            case "APRIL" :
                month = 3;
                break;
            case "MAY" :
                month = 4;
                break;
            case "JUNE" :
                month = 5;
                break;
            case "JULY" :
                month = 6;
                break;
            case "AUGUST" :
                month = 7;
                break;
            case "SEPTEMBER" :
                month = 8;
                break;
            case "OCTOBER" :
                month = 9;
                break;
            case "NOVEMBER" :
                month = 10;
                break;
            case "DECEMBER" :
                month = 11;
                break;
        }

        Date startTime = new Date();
        startTime.setYear(year);
        startTime.setMonth(0);
        startTime.setDate(0);

        Date finishTime = new Date();
        finishTime.setYear(year);
        finishTime.setMonth(month);
        finishTime.setDate(day);
        long oneDay = 24 * 60 * 60 * 1000;
        int count = (int) ((finishTime.getTime() - startTime.getTime()) / oneDay);
        if (count % 2 == 0) {
            return false;
        } else return true;
    }
}
