package Level_3;

/**
 * Title - Головоломка со скобками # 0306.
 * @task Расставить правильно (по другому) скобки, чтобы на экран вывелось число 382
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод main должен содержать только один вызов System.out.println.
 * •	Последовательность цифр и арифметических операций изменять нельзя.
 * •	Количество круглых скобок должно остаться прежним (2 открывающие и 2 закрывающие).
 * •	Метод main должен выводить на экран число 382.
 */

public class Task_0306 {
    public static void main(String[] args) {
        System.out.println(2 * (3 + 4 * (5 + 6 * 7)));
    }
}
