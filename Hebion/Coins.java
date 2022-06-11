
import java.util.*;

class Code
{  
    static int min_coins(int [] coins,int n,int sum)
    {
        if(sum == 0)
            return 0;

        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(coins[i] <= sum)
            {
                int sol = 1 + min_coins(coins,n,sum-coins[i]);
                sol = Math.min(min,sol);
            }
        }
        return sol;
    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);

        int coins[] =  {9,6,3,2,1};
        int sum = 11;
        int n = coins.length;

        int min = min_coins(coins,n,sum);

	}
}
