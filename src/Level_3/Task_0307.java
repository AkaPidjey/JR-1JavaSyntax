package Level_3;

/**
 * Title - Привет StarCraft! # 0307.
 * @task Создать 5 зергов, 3 протосса и 4 террана.
 * Дать им всем уникальные имена.
 *
 * Требования:
 * •	Нельзя изменять классы Zerg, Protoss и Terran.
 * •	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
 * •	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
 * •	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
 */

public class Task_0307 {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "zerg5";
        Protoss protoss1 = new Protoss();
        protoss1.name = "protoss1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "protoss2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "protoss3";
        Terran terran1 = new Terran();
        terran1.name = "terran1";
        Terran terran2 = new Terran();
        terran2.name = "terran2";
        Terran terran3 = new Terran();
        terran3.name = "terran3";
        Terran terran4 = new Terran();
        terran4.name = "terran4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
