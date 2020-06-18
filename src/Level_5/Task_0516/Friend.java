package Level_5.Task_0516;

/**
 * Title - Друзей не купишь # 0516.
 * @task Создать класс Friend (друг) с тремя конструкторами:
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 *
 * Требования:
 * •	У класса Friend должна быть переменная name с типом String.
 * •	У класса Friend должна быть переменная age с типом int.
 * •	У класса Friend должна быть переменная sex с типом char.
 * •	У класса должен быть конструктор, принимающий в качестве параметра имя
 * и инициализирующий соответствующую переменную класса.
 * •	У класса должен быть конструктор, принимающий в качестве параметров имя,
 * возраст и инициализирующий соответствующие переменные класса.
 * •	У класса должен быть конструктор, принимающий в качестве параметров имя,
 * возраст, пол и инициализирующий соответствующие переменные класса.
 */

public class Friend {
    String name;
    int age;
    char sex;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
    }
}
