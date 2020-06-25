package Level_10;

/**
 * Title - Конструкторы класса Human # 1013.
 * @task Напиши класс Human с 6 полями.
 * Придумай и реализуй 10 различных конструкторов для него.
 * Каждый конструктор должен иметь смысл.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	В классе Human должно быть 6 полей.
 * •	Все поля класса Human должны быть private.
 * •	В классе Human должно быть 10 конструкторов.
 * •	Все конструкторы класса Human должны быть public.
 */

public class Task_1013 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private double weight;
        private double height;
        private boolean education;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, double weight) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, boolean sex, int age, double weight, double height) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, boolean sex, int age, double weight, double height, boolean education) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.education = education;
        }

        public Human(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(boolean sex, double weight, boolean education) {
            this.sex = sex;
            this.weight = weight;
            this.education = education;
        }

        public Human(String name, boolean sex, double height, boolean education) {
            this.name = name;
            this.sex = sex;
            this.height = height;
            this.education = education;
        }
    }
}
