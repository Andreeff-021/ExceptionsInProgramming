package homework_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"1 str", null, "2 str"};
        dividion(10, 0);
        printArray(strings);
        findElementByIndex(array, 20);
    }

    public static void dividion (double num1, double num2) {
        if (num2 == 0) throw new ArithmeticException("Деление на ноль!");
        double result = num1 / num2;
        System.out.printf("%f : %f = %f", num1, num2, result);
    }

    public static void printArray (String[] str) {
        for(String item: str) {
            if (item == null) throw new NullPointerException("Элемент отсутствует!");
            System.out.println(item);
        }
    }

    public static void findElementByIndex (int[] arr, int index) {
        if (index > arr.length - 1) throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом нет!");
        else System.out.printf("Элемент с индексом %d равен %d", index, arr[index]);
    }
}
