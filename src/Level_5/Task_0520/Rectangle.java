package Level_5.Task_0520;

/**
 * Title - Создать класс прямоугольник (Rectangle) # 0520.
 * @task Создать класс прямоугольник (Rectangle). Его данными будут top, left, width,
 * height (верхняя координата, левая, ширина и высота).
 * Создать для него как можно больше методов конструкторов.
 *
 * Примеры:
 * - заданы 4 параметра: left, top, width, height
 * - ширина/высота не задана (оба равны 0)
 * - высота не задана (равно ширине) создаём квадрат
 * - создаём копию другого прямоугольника (он и передаётся в параметрах)
 *
 * Требования:
 * •	У класса Rectangle должны быть переменные top, left, width и height с типом int.
 * •	У класса должен быть хотя бы один конструктор.
 * •	У класса должно быть хотя бы два конструктора.
 * •	У класса должно быть хотя бы три конструктора.
 * •	У класса должно быть хотя бы четыре конструктора.
 */

public class Rectangle {
    int top;
    int left;
    int width = 0;
    int height = 0;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top) {
        this.top = top;
    }

    public static void main(String[] args) {
    }
}
