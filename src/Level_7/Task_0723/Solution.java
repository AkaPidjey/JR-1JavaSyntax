package Level_7.Task_0723;

/**
 * Title - Обратный отсчёт # 0723.
 * @task Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
 * Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
 * Thread.sleep(100); //задержка на одну десятую секунды.
 *
 * Пример:
 * 30
 * 29
 * ...
 * 1
 * 0
 * Бум!
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Программа должна выводить обратный отсчет от 30 до 0. Каждую цифру на новой строке.
 * •	Программа должна выводить "Бум!" после отсчета.
 * •	Программа должна использовать метод "Thread.sleep(100);" 31 раз.
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Бум!");
    }
}