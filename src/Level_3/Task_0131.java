package Level_3;

/**
 * Title - Полнометражная картина # 0131.
 * @task Реализуй метод getMetreFromCentimetre(int centimetre). Метод на вход принимает количество сантиметров.
 * Нужно сделать так, чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).
 *
 * Пример:
 * Метод getMetreFromCentimetre вызывается с параметром 243.
 *
 * Пример вывода:
 * 2
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод getMetreFromCentimetre(int) должен быть публичным и статическим.
 * •	Метод getMetreFromCentimetre должен возвращать значение типа int.
 * •	Метод getMetreFromCentimetre не должен ничего выводить на экран.
 * •	Метод getMetreFromCentimetre должен правильно возвращать количество полных метров в centimetre.
 */

public class Task_0131 {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int metr = centimetre / 100;
        return metr;
    }
}
