/*
Given two integers L and R, count how many numbers between them have exactly two distinct prime factors.
*/
import java.util.Scanner;

public class CountNumbersWithTwoDistinctPrimeFactors {

    static int findCount(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            int temp = i;
            int factors = 0;
            for (int j = 2; j * j <= temp; j++) {
                if (temp % j == 0) {
                    factors++;
                    while (temp % j == 0) {
                        temp /= j;
                    }
                }
            }
            if (temp > 1) {
                factors++;
            }
            if (factors == 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int r = s.nextInt();

        System.out.print(findCount(l, r));
    }
}
