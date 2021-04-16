package ArraysExamples;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myArr = new int[25];
        int[] Arr = {1, 2, 3, 4, 5};
        int[] myInt = getArrays(5);
        for (int i = 0; i < myInt.length; i++) {
            System.out.println(i + " element = " + myInt[i]);
        }
        System.out.println("the average is: "+getSum(myInt));
    }

    public static int[] getArrays(int number) {
        System.out.println("enter value for:" + number + ".\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();


        }
        return values;
    }

    public static double getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double)arr.length;

    }


}
