package Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Title - Номер месяца # 0828.
 * @task Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
 * Используйте коллекции.
 *
 * Требования:
 * •	Программа должна считывать одно значение с клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Программа должна использовать коллекции.
 * •	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
 */

public class Task_0828 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
        String s = reader.readLine();
        System.out.println(s + " is the " + map.get(s) + " month");
    }
}
