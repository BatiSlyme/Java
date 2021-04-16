package ArraysExamples;

import java.util.Arrays;

public class Sort2Arraysin1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 7, 10, 15};
        int[] arr2 = {1, 2, 3, 4, 5, 11};
        int[] combineArr = new int[arr1.length + arr2.length];
//        combine both arrays
        for (int i = 0; i < arr2.length; i++) {
            combineArr[i] = arr1[i];
            combineArr[i + combineArr.length / 2] = arr2[i];
        }


        combineArr = sortedArray(combineArr);
        System.out.println(Arrays.toString(combineArr));

    }

    public static int[] sortedArray(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

}
