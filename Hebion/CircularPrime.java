import java.util.*;

class CircularPrime
{  
    static boolean is_prime(int n)
    {
        if(n<2)
            return false;
        for(int i = 2;i<=n/2;i++)
            if(n%i == 0)
                return false;
        return true;
    }

   static boolean is_CircularPrime(String[] s)
   {
       for(int i= 0;i<s.length;i++)
       {
           int num = Integer.parseInt(s[i]);
           if(!is_prime(num))
               return false;
       }
       return true;
   }

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 2;i<n;i++)
        {
            if(isCheck(i))
                System.out.println(i+" ");
        }

    }

    public static boolean isCheck(int number){  
		
        String num = String.valueOf(number);
    
        int n = num.length();
       
        String[] s = new String[n];

        for(int i = 0;i<n;i++)
             s[i] = num.substring(i,n) + num.substring(0,i);
    
        return is_CircularPrime(s);
    }
}
