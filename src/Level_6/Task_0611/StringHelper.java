package Level_6.Task_0611;

/**
 * Title - Класс StringHelper # 0611.
 * @task Сделать класс StringHelper, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 *
 * Пример:
 * Амиго -> АмигоАмигоАмигоАмигоАмиго
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Методы класса StringHelper должны возвращать строку.
 * •	Методы класса StringHelper должны быть статическими.
 * •	Методы класса StringHelper должны быть public.
 * •	Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
 * •	Метод multiply(String s) должен возвращать строку повторенную 5 раз.
 */

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result =  "";
        for (int a = 0; a < count; a++) {
            result = result + s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Амиго", 7));;
    }
}
