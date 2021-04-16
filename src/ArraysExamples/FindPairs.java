package ArraysExamples;

import java.util.Scanner;

public class FindPairs {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = sockMerchant(n, ar);

    }
    static int sockMerchant(int n, int[] ar) {
        if (n >= 1 && n <= 100) {
//             length
//            n = scanner.nextInt();
            int pairs = 0;
//            for (int i = 0; i < n; i++) {
//                System.out.println("enter a number");
//                ar[i] = scanner.nextInt();
//            }
            for (int i = 0; i < n; i++) {
                if (ar[i] >= 1 && ar[i] <= 100 && i >= 0 && i < n) {
                    for (int j = i + 1; j < n; j++) {
                        if (ar[i] == ar[j]) {
                            pairs++;
                        }
                    }
                } else {
                    return -1;
                }
            }
            double sqrt = Double.valueOf(pairs);
            pairs = (int) (Math.sqrt(sqrt));
            return pairs;
        } else {
            return -1;
        }


    }
}
