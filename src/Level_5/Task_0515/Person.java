package Level_5.Task_0515;

/**
 * Title - Инициализация объектов # 0515.
 * @task Изучи внимательно класс Person.
 * Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	У класса Person должно быть 5 переменных.
 * •	У класса должен быть один метод initialize.
 * •	Метод initialize должен иметь пять параметров.
 */

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {
    }
}
