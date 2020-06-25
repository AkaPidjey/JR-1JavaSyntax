package Level_10;

/**
 * Title - Расставьте минимум static-ов # 1014.
 * @task Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.
 *
 * Требования:
 * •	В классе должна быть переменная A.
 * •	В классе должна быть переменная B.
 * •	В классе должна быть переменная C.
 * •	В классе должна быть переменная D.
 * •	Метод main не изменять.
 * •	Метод getA не изменять.
 */

public class Task_1014 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Task_1014 task = new Task_1014();
        task.A = 5;
        task.B = 5 * B;
        task.C = 5 * C * D;
        task.D = 5 * D * C;
        task.D = 5;
    }

    public int getA() {
        return A;
    }
}
