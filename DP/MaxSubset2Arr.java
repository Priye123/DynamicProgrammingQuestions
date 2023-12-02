package DP;

public class MaxSubset2Arr {
    public static void main(String[] args) {
        int a[]={2,3,4,-8,2};
        int b[]={-5,8,3,1,-4};

        int dp[]=new int[a.length];
        dp[0]=Math.max(a[0],b[0]);
        dp[1]=Math.max(Math.max(a[1],b[1]),dp[0]);

        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],Math.max(a[i]+dp[i-2],b[i]+dp[i-2]));
        }
        System.out.println(dp[dp.length-1]);
    }
}
