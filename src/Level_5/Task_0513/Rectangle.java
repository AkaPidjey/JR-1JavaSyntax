package Level_5.Task_0513;

/**
 * Title - Собираем прямоугольник # 0513.
 * @task Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
 * (верхняя координата, левая, ширина и высота).
 * Создать для него как можно больше методов initialize(...)
 *
 * Примеры:
 * - заданы 4 параметра: left, top, width, height
 * - ширина/высота не задана (оба равны 0)
 * - высота не задана (равно ширине) создаём квадрат
 * - создаём копию другого прямоугольника (он и передаётся в параметрах)
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	У класса Rectangle должны быть переменные top, left, width и height с типом int.
 * •	У класса должен быть хотя бы один метод initialize.
 * •	У класса должно быть хотя бы два метода initialize.
 * •	У класса должно быть хотя бы три метода initialize.
 * •	У класса должно быть хотя бы четыре метода initialize.
 */

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize( int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize( int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize( int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void initialize( int top) {
        this.top = top;
    }

    public static void main(String[] args) {
    }
}
