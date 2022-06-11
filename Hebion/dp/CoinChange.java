import java.util.*;

class CoinChange
{  
    /*
    static int getCoins(int coins[],int index,int sum){
        // Base cases
        if(sum == 0) return 1;
        if(index == 0) return 0;
        

        // Recursive cases
        int res =  getCount(coins,index-1,sum);                     // next val 
        if(coins[index-1] <= sum)                                   // if sum > next coin
            res = res + getCoins(coins,index,sum-coins[index-1]);   // sub coin form total and repeat
        
        return res;
    }
    */

    static int getCoins(int coins[],int n,int sum);
    {
        int dp[][] = new int[sum+1][n+1];

        for(int j = 0;j<n+1,j++)
            dp[0][j] = 1;

        for(int i = 1;i<=n;i++)
            for(int j = 1;i<=sum;j++)
            {
                dp[i][j] = dp[i][j-1]; //pre val
                if(coins[j-1] <= i)
                    dp[i][j] += dp[i-coins[j-1]][j];
            }
        return dp[sum][n];
            
    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);

        int coin = {1,2,3,4};
        int sum = 10;


        //int dp[][] = new int[sum+1][coin.length()-1];
        
        System.out.println(getCoins(coins,coins.length,sum));

	}
}
