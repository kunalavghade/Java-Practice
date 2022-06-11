
import java.util.*;  

class NearestPrime   
{  

    static boolean is_prime(int n)
    {
        if(n < 2) return false;
        for(int i = 2;i<= n/2;i++)
            if(n%i == 0)
                return false;
        return true;
    }
    static int nearstPrime(int n)
    {
        int left = 0;
        for(int i = n-1;i>=2;i--)
        {
            if(is_prime(i))
            {
                left = i;
                break;
            }
        }

        int right = 0,i=n+1;
        while(true)
        {
            if(is_prime(i))
            {
                right = i;
                break;
            }
            i++;
        }

        if(n-left < right-n)
            return left;
        return right;
    }

	public static void main(String[] args)  
	{  
		Scanner sc= new Scanner(System.in);  
        int n = sc.nextInt();
        n = nearstPrime(n);
        System.out.println(n);
	}  
}  
