package Level_9;

/**
 * Title - И снова StackTrace # 0902.
 * @task Написать пять методов, которые вызывают друг друга.
 * Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 *
 * Требования:
 * •	В классе должно быть 5 методов (метод main не учитывать).
 * •	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
 * •	Каждый метод должен возвращать имя метода, вызвавшего его.
 * •	Для получения имени вызвавшего метода, используй метод getMethodName.
 */

public class Task_0902 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }
}
