import sort.SelectionSort;

import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,5,1,4,-1,8,9,2,0,1,5,7,0,1};
        SelectionSort.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

}
