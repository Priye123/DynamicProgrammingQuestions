package DP;

public class MaxSumSubset {
    public static void main(String[] args) {
        //maxSumsubset();
        // maxSumsubsetDP();
        minCost();
    }

    private static void minCost() {
        int a[] = {1, 4, 5, 2};
        int dp[] = new int[a.length];

        dp[0] = 0;
        dp[1] = Math.abs(a[0] - a[1]);
        dp[2] = Math.abs(a[1] - a[2]) + dp[1];

        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.min(
                    Math.abs(a[i] - a[i - 1]) + dp[i - 1],
                    Math.abs(a[i] - a[i - 3]) + dp[i - 3]);
        }
        System.out.println(dp[dp.length - 1]);
    }

    private static void maxSumsubsetDP() {
        int arr[] = {2, -3, 5, 8, -7, -3, 4};
        int dp[] = new int[arr.length];

        dp[0] = arr[0];
        dp[1] = Math.max(dp[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        System.out.println(dp[dp.length - 1]);

    }

    private static void maxSumsubset() {
        int arr[] = {2, -3, 5, 8, -7};
        int s[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;//-infinite

        for (int i = 0; i < arr.length; i++) { //main array

            int sum = 0;

            for (int j = i; j < arr.length; j += 2) {
                sum = sum + arr[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
