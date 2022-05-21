package sort;

/**
 * Сортировка выборкой
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length;
        for (int i = left; i < right; i++) {
            int minElementIndex = i;
            for (int j = i; j < right; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minElementIndex];
            arr[minElementIndex] = tmp;
        }
    }

}
