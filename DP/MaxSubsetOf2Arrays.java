package DP;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class MaxSubsetOf2Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int[] dp = new int[n];

        dp[0] = Math.max(a[0], b[0]);
        dp[1] = Math.max(dp[0], Math.max(a[1], b[1]));

        for (int i = 2; i < n; i++) {
            int x = dp[i - 1];
            int y = b[i] + dp[i - 2];
            int z = a[i] + dp[i - 2];
            dp[i] = Math.max(x, Math.max(y, z));
        }

        System.out.println("Answer: " + dp[dp.length-1]);
    }
}

