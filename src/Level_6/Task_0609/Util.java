package Level_6.Task_0609;

/**
 * Title - Расстояние между двумя точками # 0609.
 * @task Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
 * Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
 *
 * Требования:
 * •	Метод getDistance должен возвращать double.
 * •	Метод getDistance должен быть статическим.
 * •	Метод getDistance должен быть public.
 * •	Метод getDistance должен возвращать расстояние между точками.
 * •	Метод getDistance должен использовать метод double Math.sqrt(double a).
 */

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = Math.sqrt (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return a;
    }

    public static void main(String[] args) {
    }
}
