package Level_4.Task_0408;

/**
 * Title - Хорошо или плохо? # 0408.
 * @task Написать метод compare(int a), чтобы он:
 * - выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
 * - выводил строку "Число больше 5", если параметр метода больше 5,
 * - выводил строку "Число равно 5", если параметр метода равен 5.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Метод main не должен вызывать System.out.println или System.out.print.
 * •	Метод main должен вызывать метод compare.
 * •	Метод compare должен быть void.
 * •	Метод compare должен выводить текст на экран согласно заданию.
 */

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if( a  < 5)
            System.out.println("Число меньше 5");
        if( a  > 5)
            System.out.println("Число больше 5");
        if( a  == 5)
            System.out.println("Число равно 5");
    }
}
