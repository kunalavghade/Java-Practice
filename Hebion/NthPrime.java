import java.util.*;  

class NthPrime   
{  
    static boolean is_prime(int n)
    {
        if(n<2) return false;
        int i = 2;
        while(i<= n/2)
        {
            if(n%i == 0)
                return false;
            i++;
        }
        return true;
    }
    static int nthPrime(int n)
    {
        if(n==1) return 2;
        int i = 3;
        int prime = 1;
        while(true)
        {
            if(is_prime(i))
                prime++;
            if(prime == n)
                break;
            i++;
        }
        return i-1;
    }


	public static void main(String[] args)  
	{  
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int nth = nthPrime(n);
        System.out.println(nth);
	}  
}  
