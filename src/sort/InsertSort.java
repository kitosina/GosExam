package sort;

/**
 * Сортировка вставками
 */
public class InsertSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i - 1;
            int value = arr[i];
            for (int j = index; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
                index--;
            }
            arr[index + 1] = value;
        }
    }

}
