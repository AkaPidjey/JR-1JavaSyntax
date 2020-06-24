package Level_9;

/**
 * Title - Там, в синих глубинах стек-трейса… # 0905.
 * @task Написать метод, который возвращает результат - глубину его стек-трейса - количество методов
 * в нем (количество элементов в списке).
 * Это же число метод должен выводить на экран.
 *
 * Требования:
 * •	Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
 * •	Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
 * •	Воспользуйся методом Thread.currentThread().getStackTrace().
 * •	Метод main должен вызывать метод getStackTraceDepth.
 */

public class Task_0905 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int stackTraceLenght = stackTraceElement.length;
        System.out.println(stackTraceLenght);
        return stackTraceLenght;
    }
}
