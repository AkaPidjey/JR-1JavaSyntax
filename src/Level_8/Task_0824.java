package Level_8;

import java.util.ArrayList;

/**
 * Title - Собираем семейство # 0824.
 * @task 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Класс Human должен содержать четыре поля.
 * •	Класс Human должен содержать один метод.
 * •	Класс Solution должен содержать один метод.
 * •	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки,
 * две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */

public class Task_0824 {
    public static void main(String[] args) {
        Human child1 = new Human("Vera", false, 25);
        Human child2 = new Human("Artem", true, 20);
        Human child3 = new Human("Dmitriy", true, 15);
        Human fater = new Human("Nikolay", true, 50);
        Human mather = new Human("Alevtina", false, 45);
        Human dad1 = new Human("Vasaj", true, 80);
        Human dad2 = new Human("Petaj", true, 90);
        Human granma1 = new Human("Alisa", false, 75);
        Human granma2 = new Human("Vasilisa", false, 85);
        granma1.children.add(fater);
        dad1.children.add(fater);
        granma2.children.add(mather);
        dad2.children.add(mather);
        fater.children.add(child1);
        fater.children.add(child2);
        fater.children.add(child3);
        mather.children.add(child1);
        mather.children.add(child2);
        mather.children.add(child3);
        System.out.println(granma1.toString());
        System.out.println(dad1.toString());
        System.out.println(granma2.toString());
        System.out.println(dad2.toString());
        System.out.println(fater.toString());
        System.out.println(mather.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;
                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
