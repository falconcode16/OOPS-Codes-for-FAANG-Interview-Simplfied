package Prep;

import java.util.*;

public class SortingAlgo {
    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Space: O(1) also known as inplace(No need of creating new array) sorting
    // algo.
    // Time: Best: O(n);
    // Time: Worst: O(n^2);
    public static void BubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void CyclicSort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] MergeSort(int arr[]) {

        if (arr.length == 1) {

            return arr;
        }

        int mid = arr.length / 2;

        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {

            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {

            mix[k] = second[i];
            j++;
            k++;
        }

        return mix;
    }

}
