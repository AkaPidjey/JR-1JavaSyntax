package Level_7.Task_0725;

/**
 * Title - Переставь один модификатор static # 0725.
 * @task Переставь один модификатор static, чтобы пример скомпилировался.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	В классе должна быть переменная A.
 * •	В классе должна быть переменная B.
 * •	В классе должна быть переменная C.
 * •	В классе должен быть метод main.
 * •	В классе должен быть метод getValue.
 * •	В классе должно быть 4 модификатора static (переменные и методы).
 */

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public int getValue() {
        return C;
    }
}
