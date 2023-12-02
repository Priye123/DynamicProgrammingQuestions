package DP;

public class MaxSumSubsetNoAdjacent {
    public static void main(String[] args) {
        int a[]={2,-3,5,8,-7};
        //1.create dp array of size 5
        int dp[]=new int[a.length];
        //2.find dp[0],dp[1] by basic observations
        dp[0]=a[0];
        dp[1]=Math.max(a[0],a[1]);
        //3.create a general formula
        //dp[i]= max(a[i]+dp[i-2],dp[i-1])

        //4.dp[1],dp[2]....dp[n] using loop & the general formula
        for(int i=2;i<a.length;i++){
            dp[i]= Math.max(a[i]+dp[i-2],dp[i-1]);
        }

        //5.see the pattern & get the answer
        System.out.println(dp[dp.length-1]);
    }
}
