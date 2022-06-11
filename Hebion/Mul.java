import java.util.*;

class Code
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        int a[] = {1,3,4,5};
        int x[] = {1,2,3};

        int ans = a[0];
        int poly = 1;
        for(int i = 1;i<a.length;i++)
        {
            poly *= x[i-1];  
            ans = a[i]*poly;
        }
        System.out.print(ans);
	}
}
