// DIVIDE AND MERGE

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("MERGE SORT");
        int arr[] = new int[] {
                1, 5, 9, 8, 6, 4, 7
        };
        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void mergeSort(int arr[], int low, int high) {

        if (low == high) {
            // End
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeFn(arr, low, mid, high);
    }

    public static void mergeFn(int arr[], int low, int mid, int high) {
        int leftPtr = low;
        int rightPtr = mid + 1;
        int merged[] = new int[high - low + 1];
        int i = 0;
        while (leftPtr <= mid && rightPtr <= high) {
            if (arr[leftPtr] > arr[rightPtr]) {
                merged[i] = arr[rightPtr];
                rightPtr++;
            } else {
                merged[i] = arr[leftPtr];
                leftPtr++;
            }
            i++;
        }
        while (rightPtr <= high) {
            // Keep adding
            merged[i] = arr[rightPtr];
            rightPtr++;
            i++;
        }
        while (leftPtr <= mid) {
            merged[i] = arr[leftPtr];
            leftPtr++;
            i++;
        }

        for (int k = low; k <= high; k++) {
            arr[k] = merged[k - low];
        }
    }
}
