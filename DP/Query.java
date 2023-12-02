package DP;

public class Query {
    public static void main(String[] args) {
       // a();
        aDP();
    }

    private static void aDP() {
        int n = 5; // size of the array
        int[] a = {6, 7, 3, 2, 2};

        int q = 4; // number of queries
        int[] w = {0, 3, 4, 2}; // query array

        int dp[]=new int[a.length];
        dp[0]=a[0];

        for(int i=1;i<dp.length;i++){
            dp[i]=dp[i-1]+a[i];
        }

        for(int x:w){
            System.out.println(dp[x]);
        }
    }

    private static void a() {
        int n = 5; // size of the array
        int[] master = {6, 7, 3, 2, 2};

        int q = 4; // number of queries
        int[] index = {0, 3, 4, 2}; // query array

        //o(n2)
        for (int j = 0; j < master.length; j++) {
            int sum = 0;
            for (int i = 0; i <= index[j]; i++) {
                sum = sum + master[i];
            }
            System.out.println(sum);
        }
    }
}
