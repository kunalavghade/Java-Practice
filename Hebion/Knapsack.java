
import java.util.*;

class Knapsack
{  
    public static int knapsack(int w[],int v[],int C,int n)
    {
        if(n == 0 || C == 0)
            return 0;

        if(w[n-1] <= C)
        {
            int opt1 = v[n-1] + knapsack(w,v,C-w[n-1],n-1);
            int opt2 = knapsack(w,v,C,n-1);
            return Math.max(opt1,opt2);
        }
        
        return knapsack(w,v,C,n-1); 

    }

    public static double gredyKs(int w[],int v[],int C,int n){
        
        double ratio[] = new double[n];

        for(int i = 0;i<n;i++)
            ratio[i] =  (double) v[i] / w[i];

        for(int i = 0;i<n;i++)
            for(int j = 0;j<n-i-1;j++)
            {
                if(ratio[j] < ratio[j+1])
                {
                    int tmp = w[j];
                    w[j] = w[j+1];
                    w[j+1] = tmp;

                    double t = ratio[j];
                    ratio[j] = ratio[j+1];
                    ratio[j+1] = t;

                    tmp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = tmp;
                }

            }
        
        double total = 0;
        for(int i = 0; i< n;i++)
        {
            if(w[i]<= C)
            {
                total += v[i];
                C -= w[i];
            }
            else
            {
                double fraction = (double) C/w[i];
                total += v[i] * fraction;
            }
        }
        return total;
    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        int w[] = {10,20,30};
        int v[] = {50,40,90};

        int c = 50;

        System.out.println(gredyKs(w,v,c,w.length));
	}
}
