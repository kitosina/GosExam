package sort;

/**
 * Сортировка шейкерная
 */
public class CocktailSort {

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                }
            }
            left++;
        }
    }

}
