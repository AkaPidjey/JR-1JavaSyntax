package Level_8;

/**
 * Title - Модификатор запутался # 0825.
 * @task Переставь один модификатор static, чтобы пример скомпилировался.
 *
 * Требования:
 * •	В классе Solution должна быть переменная A.
 * •	В классе Solution должна быть переменная B.
 * •	В классе Solution должна быть переменная C.
 * •	В классе Solution должна быть переменная D.
 * •	Класс Solution должен содержать только три метода.
 * •	В классе должно быть 4 статика (переменные и методы).
 */

public class Task_0825 {
    public static int A = 5;
    public static int B = 2;
    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}
