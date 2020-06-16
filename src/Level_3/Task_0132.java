package Level_3;

/**
 * Title - Сумма цифр трехзначного числа # 0132.
 * @task Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число.
 * Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
 *
 * Пример:
 * Метод sumDigitsInNumber вызывается с параметром 546.
 *
 * Пример вывода:
 * 15
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
 * •	Метод sumDigitsInNumber должен возвращать значение типа int.
 * •	Метод sumDigitsInNumber не должен ничего выводить на экран.
 * •	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
 */

public class Task_0132 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a1 = number / 100; // a1=5
        int a2 = a1 * 100; // a2 = 500
        int a3 = number - a2; //a3 = 46
        int a4 = a3 / 10;   // a4 = 4
        int a5 = a4 * 10; // a5 = 40
        int a6 = a3 - a5;  // a6 = 6
        int a7 = a1 + a4 + a6;
        return a7;
    }
}
