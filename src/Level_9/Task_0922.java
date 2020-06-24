package Level_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Title - Какое сегодня число? # 0922.
 * @task Ввести с клавиатуры дату в формате "2013-08-18"
 * Вывести на экран введенную дату в виде "AUG 18, 2013".
 * Воспользоваться объектом Date и SimpleDateFormat.
 *
 * Требования:
 * •	Программа должна считывать данные с клавиатуры.
 * •	В программе должна быть объявлена переменная типа SimpleDateFormat.
 * •	В программе должна быть объявлена переменная типа Date.
 * •	Программа должна выводить данные на экран.
 * •	Вывод должен соответствовать заданию.
 */

public class Task_0922 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date input = date1.parse(vvod);
        SimpleDateFormat date2 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(date2.format(input).toUpperCase());
    }
}
