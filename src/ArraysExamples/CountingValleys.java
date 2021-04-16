package ArraysExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    private static Scanner scanner = new Scanner(System.in);

    public static int countingValleys(int steps, String path) {
        int valley = 0;
        int sum = 0;
        char[] chararray = path.toCharArray();
        if (steps >= 2 && steps <= (10 ^ 6)) {
            for (int i = 0; i < chararray.length; i++) {
                if (chararray[i] != 'U' && chararray[i] != 'D') {
                    return 0;
                } else {
                    if (chararray[i] == 'U') {
                        sum++;

                    } else if(chararray[i] == 'D') { //
                        if (sum == 0 ) {
                            valley++;
                        }
                        sum--;
                    }
                }
            }
        } else {
            return 0;
        }
        return valley;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());
        String path = bufferedReader.readLine();
        int result = CountingValleys.countingValleys(steps, path);

    }

}
