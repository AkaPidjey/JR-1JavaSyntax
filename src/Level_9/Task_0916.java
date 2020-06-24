package Level_9;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Title - Перехват checked-исключений # 0916.
 * @task В методе handleExceptions обработайте все checked исключения.
 * Нужно вывести на экран возникшее checked исключение.
 * Можно использовать только один блок try..catch
 *
 * Требования:
 * •	Метод handleExceptions должен вызывать метод method1.
 * •	Метод handleExceptions должен вызывать метод method2.
 * •	Метод handleExceptions должен вызывать метод method3.
 * •	Метод handleExceptions должен использовать только один блок try..catch.
 * •	Метод handleExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
 * •	Программа должна выводить на экран текст.
 */

public class Task_0916 {
    public static void main(String[] args) {
        handleExceptions(new Task_0916());
    }

    public static void handleExceptions(Task_0916 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException e) {
            System.out.println(e);
        }catch (NoSuchFieldException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
