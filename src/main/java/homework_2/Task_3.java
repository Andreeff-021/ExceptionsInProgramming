package homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        checkForNull();
    }

    public static void checkForNull() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные: ");
        try {
            String result = reader.readLine();
            if (result.equals("")) throw new RuntimeException("Пустая строка!");
            System.out.println(result);
        } catch (IOException e) {
            throw new RemoteException();
        }
    }
}
