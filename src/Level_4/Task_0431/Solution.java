package Level_4.Task_0431;

/**
 * Title - От 10 до 1 # 0431.
 * @task Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.
 *
 * Требования:
 * •	Программа не должна считывать числа c клавиатуры.
 * •	Программа должна выводить числа на экран.
 * •	Каждое значение должно быть выведено с новой строки.
 * •	Программа должна выводить числа от 10 до 1.
 * •	В программе должен использоваться цикл while.
 */

public class Solution {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
