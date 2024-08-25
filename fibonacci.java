public class fibonacci {
    public static int fibo(int n,int[] dp){
        if(n<=1)
            return n;
        if(dp[n]!=0)
            return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String[] args) {
        int dp[]=new int[5+1];
        System.out.println(fibo(5,dp));
    }
}
