import java.util.*;

class MatPat
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);

        int n = 5;
        int mat[][] = new int[n][n];

        int num = 1;
        for(int i= 0;i<n;i++)
            for(int j = 0;j<=i;j++)
                mat[i][j] = num++; 

        for(int i = n-1;i>=0;i--)
            for(int j = n-1;j>i;j--)
                mat[i][j] = num++;

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
                System.out.print(mat[i][j]+"\t");
        System.out.println("\n");
        }
	}
}
