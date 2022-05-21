package sort;

/**
 * Сортировка Шелла
 */
public class ShellSort {

    public static void sort(int[] arr) {
        int size = arr.length;
        int range = size / 2;
        while (range > 0) {

            for (int i = 0; i < size - range; i++) {
                insertSort(arr, i, i + range, range);
            }

            range = range / 2;
        }
    }

    private static void insertSort(int[] arr, int start, int end, int range) {
        for (int i = start; i <= end; i += range) {
            int index = i;
            int value = arr[i];
            for (int j = index - range; j >= 0 && arr[j] > value; j -= range) {
                arr[j + range] = arr[j];
                index -= range;
            }
            arr[index] = value;
        }
    }

}
