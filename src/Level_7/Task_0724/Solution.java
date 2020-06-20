package Level_7.Task_0724;

/**
 * Title - Семейная перепись # 0724.
 * @task Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 * Вывести объекты на экран.
 *
 * Примечание:
 * Если написать свой метод String toString() в классе Human, то именно он будет
 * использоваться при выводе объекта на экран.
 *
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 * ...
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * •	Добавить в класс конструктор public Human(String name, boolean sex, int age).
 * •	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
 * •	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
 * •	Выведи созданные объекты на экран.
 */

public class Solution {
    public static void main(String[] args) {
        Human dad1 = new Human("Vasja", true, 80);
        Human dad2 = new Human("Petja", true, 90);
        Human mom1 = new Human("Alisa", false, 75);
        Human mom2 = new Human("Klava", false, 85);
        Human father = new Human("Oleg", true, 50, dad1, mom1);
        Human mother = new Human("Darja", false, 45, dad2, mom2);
        Human child1 = new Human("Frosja", false, 20, father, mother);
        Human child2 = new Human("Rodion", true, 15, father, mother);
        Human child3 = new Human("Olga", false, 10, father, mother);
        System.out.println(dad1.toString());
        System.out.println(dad2.toString());
        System.out.println(mom1.toString());
        System.out.println(mom2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
