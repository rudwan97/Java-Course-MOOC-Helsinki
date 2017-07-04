import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int minIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int newNumberFirstIndex = array[index2];
        int newNumberSecondIndex = array[index1];
        array[index1] = newNumberFirstIndex;
        array[index2] = newNumberSecondIndex;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index2 = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index2);
        }
    }

}
