package DP;

import java.util.Scanner;

public class AmazonMLQuestion {
    public static void main(String[] args) {
        System.out.println("Input number of cities::");
        Scanner sc = new Scanner(System.in);
        int NumberOfCities = sc.nextInt();//6

        System.out.println("Enter the costs of " + NumberOfCities + "cities");
        int cost[] = new int[NumberOfCities + 1];

        for (int i = 1; i <= NumberOfCities; i++) {
            cost[i] = sc.nextInt();
        }

//        for(int x:cost)
//            System.out.print(x+" ");
        int dp[] = new int[NumberOfCities + 1];//7

        dp[1] = 0;
        dp[2] = Math.abs(cost[2] - cost[1]) + dp[1];

        for (int i = 3; i <= NumberOfCities; i++) {
            dp[i] = Math.min(Math.abs(cost[i] - cost[i - 1]) + dp[i - 1], Math.abs(cost[i] - cost[i - 3]) + dp[i - 3]);
        }
        System.out.println(dp[dp.length-1]);
    }
}
