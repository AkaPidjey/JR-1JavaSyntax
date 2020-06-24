package Level_9;

/**
 * Title - Статики не на своем месте # 0925.
 * @task Расставь модификаторы static так, чтобы пример скомпилировался.
 *
 * Требования:
 * •	В классе должна быть переменная A.
 * •	В классе должна быть переменная B.
 * •	В классе должна быть переменная C.
 * •	Метод main не изменять.
 * •	Метод getA не изменять.
 * •	В классе должно быть 3 статических поля.
 */

public class Task_0925 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Task_0925 room = new Task_0925();
        room.A = 5;

        Task_0925.D = 5;
    }

    public int getA() {
        return A;
    }
}
