package Level_6.Task_0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title - Родственные связи кошек # 0621.
 * @task Задача: У каждой кошки есть имя и кошка-мама.
 * Создать класс, который бы описывал данную ситуацию.
 * Создать два объекта: кошку-дочь и кошку-маму.
 * Вывести их на экран.
 *
 * Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
 * Изменить класс Cat так, чтобы он мог описать данную ситуацию.
 * Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
 * Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 *
 * Пример ввода:
 * дедушка Вася
 * бабушка Мурка
 * папа Котофей
 * мама Василиса
 * сын Мурчик
 * дочь Пушинка
 *
 * Пример вывода:
 * The cat's name is дедушка Вася, no mother, no father
 * The cat's name is бабушка Мурка, no mother, no father
 * The cat's name is папа Котофей, no mother, father is дедушка Вася
 * The cat's name is мама Василиса, mother is бабушка Мурка, no father
 * The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
 * The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 *
 * Требования:
 * •	Программа должна считывать имена 6 котов в указанном порядке.
 * •	Метод main должен создавать 6 объектов типа Cat.
 * •	Программа должна выводить 6 строк с информацией о котах.
 * •	Строка про дедушку (первая) должна соответствовать условию.
 * •	Строка про бабушку (вторая) должна соответствовать условию.
 * •	Строка про папу (третья) должна соответствовать условию.
 * •	Строка про маму (четвертая) должна соответствовать условию.
 * •	Строка про сына (пятая) должна соответствовать условию.
 * •	Строка про дочь (шестая) должна соответствовать условию.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);
        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandpa, null);
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandma);
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);
        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat pa;
        private Cat ma;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat pa, Cat ma) {
            this.name = name;
            this.pa = pa;
            this.ma = ma;
        }
        @Override
        public String toString() {
            if (pa == null && ma == null)
                return "The cat's name is " + name + ", no mother" + ", no father ";
            else if (pa == null)
                return "The cat's name is " + name + ", mother is " + ma.name + ", no father ";
            else if (ma == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + pa.name;
            else
                return "The cat's name is " + name + ", mother is " + ma.name + ", father is " + pa.name;
        }
    }
}
