package Level_5.Task_0509;

/**
 * Title - Создать класс Friend # 0509.
 * @task Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 *
 * Примечание:
 * Имя(String), возраст(int), пол(char).
 *
 * Требования:
 * •	У класса Friend должна быть переменная name с типом String.
 * •	У класса Friend должна быть переменная age с типом int.
 * •	У класса Friend должна быть переменная sex с типом char.
 * •	У класса должен быть метод initialize, принимающий в качестве параметра имя
 * и инициализирующий соответствующую переменную класса.
 * •	У класса должен быть метод initialize, принимающий в качестве параметров имя,
 * возраст и инициализирующий соответствующие переменные класса.
 * •	У класса должен быть метод initialize, принимающий в качестве параметров имя,
 * возраст, пол и инициализирующий соответствующие переменные класса.
 */

public class Friend {
    String name;
    int age;
    char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
    }
}
