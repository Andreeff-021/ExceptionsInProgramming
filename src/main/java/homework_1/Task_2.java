package homework_1;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr1 = {43, 83, 10, 37, 56, 34};
        int[] arr2 = {22, 67, 5, 11, 15};
        System.out.print(Arrays.toString(subElementsArrays(arr1, arr2)));
    }

    public static int[] subElementsArrays (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Размеры массивов не равны!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
