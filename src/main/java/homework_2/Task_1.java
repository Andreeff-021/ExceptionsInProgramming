package homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(inputFloat());
    }

    private static float inputFloat() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите дробное число: ");
            try {
                float num = Float.parseFloat(reader.readLine());
                return num;
            }
            catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
}
