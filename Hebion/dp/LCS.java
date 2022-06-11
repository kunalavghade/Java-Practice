
import java.util.*;

class LCS
{   
    static int lcs(String s1, String s2,int m,int n)
    {
        if(m == 0 || n == 0)
            return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + lcs(s1,s2,m-1,n-1);
        return Math.max(lcs(s1,s2,m,n-1),lcs(s1,s2,m-1,n));
    }
    

    static int lcsrec(String s1, String s2,int m,int n,int dp[][])
    { 
        
        if(m == 0 || n == 0)
            return 0;
        
        if(dp[m-1][n-1]!= -1)
            return dp[m-1][n-1];

        if(s1.charAt(m-1) == s2.charAt(n-1))
            dp[m-1][n-1] = 1 + lcsrec(s1,s2,m-1,n-1,dp);
        else
            dp[m-1][n-1] = Math.max(lcsrec(s1,s2,m,n-1,dp),lcsrec(s1,s2,m-1,n,dp));
        
        return dp[m-1][n-1];
    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int m = s1.length(), n =s2.length();

        int dp[][] = new int[m][n];
        for(int [] row: dp)
            Arrays.fill(row,-1);

        System.out.print(lcsrec(s1,s2,m,n,dp));
	}
}
