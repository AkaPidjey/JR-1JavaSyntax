package Level_4.Task_0405;

/**
 * Title - Задаем количество котов # 0405.
 * @task Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).
 *
 * Требования:
 * •	Класс Cat должен содержать только одну переменную catsCount.
 * •	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
 * •	Класс Cat должен содержать два метода setCatsCount и main.
 * •	Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
 */

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {
        //  setCatsCount(3);
        //  System.out.println(catsCount);
    }
}
