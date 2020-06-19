package Level_6.Task_0612;

/**
 * Title - Калькулятор # 0612.
 * @task Сделать класс Calculator, у которого будут 5 статических методов:
 * int plus(int a, int b) - возвращает сумму чисел a и b
 * int minus(int a, int b) - возвращает разницу чисел a и b
 * int multiply(int a, int b) - возвращает результат умножения числа a на число b
 * double division(int a, int b) - возвращает результат деления числа a на число b
 * double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
 *
 * Требования:
 * •	Метод plus должен возвращать сумму чисел a и b.
 * •	Метод minus должен возвращать разницу чисел a и b.
 * •	Метод multiply должен возвращать результат умножения числа a на число b.
 * •	Метод division должен возвращать результат деления числа a на число b.
 * •	Метод percent должен возвращать b процентов от числа a.
 */

public class Calculator {
    public static int plus(int a, int b) {
        int it1 = a + b;
        return it1;
    }
    public static int minus(int a, int b) {
        int it2 = a - b;
        return it2;
    }
    public static int multiply(int a, int b) {
        int it3 = a * b;
        return it3;
    }
    public static double division(int a, int b) {
        double it4 = (double) a / (double) b;
        return it4;
    }
    public static double percent(int a, int b) {
        double it5 = (double)a * 0.01 * b;
        return it5;
    }
    public static void main(String[] args) {
    }
}
