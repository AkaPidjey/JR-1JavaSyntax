package Level_4;

/**
 * Title - Мне не подходит этот возраст… # 0401.
 * @task Подумайте, что делает программа.
 * Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
 *
 * Подсказка:
 * тщательно просмотрите метод adjustAge
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Класс Person должен иметь публичное поле age типа int.
 * •	Метод adjustAge класса Person должен выводить текст на экран.
 * •	Метод adjustAge класса Person должен иметь только один параметр age типа int и тип возвращаемого значения void.
 * •	Метод main должен вызывать метод adjustAge только один раз.
 * •	Метод adjustAge класса Person должен увеличивать возраст человека (Person) на 20.
 */

public class Task_0401 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Age in adjustAge() is: " + this.age);
        }
    }
}
